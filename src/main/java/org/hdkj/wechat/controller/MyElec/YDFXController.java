package org.hdkj.wechat.controller.MyElec;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.YDFX;
import org.hdkj.wechat.service.MyElec.YDFXService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ydfx")
public class YDFXController {
	@Resource
	private YDFXService ydfxService;
	
	@ApiOperation(value = "一年用电分析", notes = "根据户号查询") 
	@RequestMapping(value="/{consNo}",method=RequestMethod.GET)
	public Map<String,Map<String,Object>> getYearYDFXConsNo(@PathVariable String consNo){
		 List<YDFX> YDFX_list=this.ydfxService.getByYDFXConsNo(consNo);
		 //获取用电电量，并计算出平均值，最大值，最小值
		 Map<String,Map<String,Object>> ansyMap = new HashMap<String, Map<String,Object>>();
		 if(YDFX_list !=null && YDFX_list.size()>0){
			 BigDecimal totalMont = new BigDecimal(0);
			 BigDecimal avgMont = new BigDecimal(0);
			 List<BigDecimal> dl_BigDec = new ArrayList<BigDecimal>();
			 BigDecimal[] billMonts = new BigDecimal[YDFX_list.size()];
			 String [] xAxis = new String [YDFX_list.size()];	
			 for (int i = 0; i < YDFX_list.size(); i++) {
					YDFX ydfxBean = YDFX_list.get(i);
					//new BigDecimal括号内放参数转换为BigDecimal
					BigDecimal biglong=new BigDecimal(ydfxBean.gettPq());
					dl_BigDec.add(biglong);
					billMonts[i] = biglong;
					xAxis[i] = ydfxBean.getRcvblYm().substring(4);
					totalMont = totalMont.add(biglong);
				}
			 //求12月的平均电量:BigDecimal的divide方法是表示方法前面的数去除以括号里面的数，
			 avgMont = totalMont.divide(new BigDecimal(12),2);
			 
			 Map<String,Object > avgMap = new HashMap<String, Object>();
			 Map<String,Object > maxMap = new HashMap<String, Object>();
			 Map<String,Object > minMap = new HashMap<String, Object>();
			 avgMap.put("BILL_MONT", avgMont);
			 ansyMap.put("avg",avgMap);
			 Arrays.sort(billMonts);//从小到大排序
			 for (int i = 0; i < YDFX_list.size(); i++) {
					YDFX ydfxBean = YDFX_list.get(i);
					BigDecimal biglong=new BigDecimal(ydfxBean.gettPq());
					//BigDecimal的compareTo方法是biglong-括号里的值
					if(biglong.compareTo(billMonts[0])==0){
						//map的containsKey方法表示map的key值包含括号里的字符返回为ture
						if(!minMap.containsKey("BILL_MONT")){
							minMap.put("BILL_MONT", billMonts[0]);
							minMap.put("BILL_DATE", ydfxBean.getRcvblYm());
							ansyMap.put("min", minMap);
						}
					}
					if(biglong.compareTo(billMonts[billMonts.length-1])==0){
						if(!maxMap.containsKey("BILL_MONT")){
							maxMap.put("BILL_MONT", billMonts[billMonts.length-1]);
							maxMap.put("BILL_DATE", ydfxBean.getRcvblYm());
							ansyMap.put("max",maxMap);							
						}
					}
			 }
			 return ansyMap;
		 }
		 return null;		 
	}
}

		 
