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
	
	@ApiOperation(value = "获取电量电费", notes = "根据id获取电量电费")  
	@RequestMapping(value = "/{rcvblAmtId}", method = RequestMethod.GET) 
	public DLDF getDLDFbyId(@PathVariable Long rcvblAmtId){
		
		DLDF dldf = this.dldfService.getDLDFbyId(rcvblAmtId);
		return dldf;
	}
	
	@ApiOperation(value = "获取电量电费", notes = "根据id获取电量电费")  
	@RequestMapping(value = "/cons/{consNo}/{rcvblYm}", method = RequestMethod.GET) 
	public List<DLDF> getDLDFbyConsnoAndDate(@PathVariable String consNo,@PathVariable String rcvblYm){
		List<DLDF> dldf_list=this.dldfService.getDLDFbyConsnoAndDate(consNo, rcvblYm);
		return dldf_list;
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
