package org.hdkj.wechat.controller.MyElec;

import java.math.BigDecimal;
import java.util.ArrayList;
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
	public List<YDFX> getYearYDFXConsNo(@PathVariable String consNo){
		 List<YDFX> YDFX_list=this.ydfxService.getByYDFXConsNo(consNo);
		 //获取用电电量，并计算出平均值，最大值，最小值
//		 Map<String,Map<String,Object>> ansyMap = new HashMap<String, Map<String,Object>>();
//		 if(YDFX_list !=null && YDFX_list.size()>0){
//			 Long totalMont = new Long(0);
//			 BigDecimal avgMont = new BigDecimal(0);			
//			 List<Long> dl_BigDec = new ArrayList<Long>();
//			 Long[] billMonts = new Long[YDFX_list.size()];
//			 String [] xAxis = new String [YDFX_list.size()];
//			 for (int i = 0; i < YDFX_list.size(); i++) {
//					YDFX ydfxBean = YDFX_list.get(i);
//					dl_BigDec.add(ydfxBean.gettPq());	
//					billMonts[i] = ydfxBean.gettPq();
//					xAxis[i] = ydfxBean.getRcvblYm().substring(4);
//					totalMont = ydfxBean.gettPq();
//				}
//		 }
		 return YDFX_list;
	}
}
