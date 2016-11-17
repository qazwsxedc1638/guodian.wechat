package org.hdkj.wechat.controller.MyElec;

import java.util.List;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.DateAmt;
import org.hdkj.wechat.service.MyElec.DateAmtService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/amt")
public class DateAmtRestController {
	@Resource
	private DateAmtService dateAmtService;
	
	@ApiOperation(value = "获取7天实时用电", notes = "根据户名和当前时间获取电量电费")  
	@RequestMapping(value="/getSevenDay/{consNo}",method=RequestMethod.GET)
	public List<DateAmt> getAmtConsNo(@PathVariable String consNo){	
		List<DateAmt> sevenAmt=this.dateAmtService.getDateAmtSevenDay(consNo);
		return sevenAmt;		
	}
	
	@ApiOperation(value = "获取7天总用电", notes = "根据户名和当前时间获取电量电费")  
	@RequestMapping(value="/total/{consNo}",method=RequestMethod.GET)
	public int getAmtAndConsNo(@PathVariable String consNo){
		int total=this.dateAmtService.getConsNoAndDates(consNo);
		return total;
	}
	
	@ApiOperation(value = "获取30天总用电", notes = "根据户名获取电量电费") 
	@RequestMapping(value="/getMonth/{consNo}",method=RequestMethod.GET)
	public List<DateAmt> getmonthConsNO(@PathVariable String consNo){
		List<DateAmt> monthAmt=this.dateAmtService.getDateAmtMonth(consNo);
		return monthAmt;
	}
}
