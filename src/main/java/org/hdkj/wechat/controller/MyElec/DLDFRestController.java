package org.hdkj.wechat.controller.MyElec;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.DLDF;
import org.hdkj.wechat.bean.MyElec.Jtdl;
import org.hdkj.wechat.service.MyElec.DLDFService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping(value = "/dldf")
public class DLDFRestController {

	@Resource
	private DLDFService dldfService;
	
	
	@ApiOperation(value = "获取电量电费", notes = "根据户号和查询时间")  
	@RequestMapping(value = "/cons/{consNo}/{rcvblYm}", method = RequestMethod.GET) 
	public List<DLDF> getDLDFbyConsnoAndDate(@PathVariable String consNo,@PathVariable String rcvblYm){
		List<DLDF> dldf_list=this.dldfService.getDLDFbyConsnoAndDate(consNo, rcvblYm);
		if(dldf_list !=null && dldf_list.size()>0){
			return dldf_list;
		}
		return null;
	}
	
	@ApiOperation(value = "获取当前余额", notes = "根据用户户号")  
	@RequestMapping(value="/balanInfo/{consNo}",method=RequestMethod.GET)
	public BigDecimal getConsNo(@PathVariable String consNo){
		 BigDecimal sum = this.dldfService.getConsNo(consNo);
		 return sum;
	}
	
	@ApiOperation(value = "获取阶梯电量", notes = "根据用户户号和时间")  
	@RequestMapping(value="/jtdlInfo/{time}/{consNo}",method=RequestMethod.GET)
	public List<Jtdl> getTimeAndConsNo(@PathVariable String time,@PathVariable String consNo){
		List<Jtdl> jtdl_list =this.dldfService.getTimeAndConsNo(time, consNo);
		return jtdl_list;
	}
}
