package org.hdkj.wechat.controller.MyElec;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	//获取当前时间的最近7天的时间
//	SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
//	String dates=f.format(new Date());
	@Resource
	private DateAmtService dateAmtService;
	
	@ApiOperation(value = "获取7天实时用电", notes = "根据户名和当前时间获取电量电费")  
	@RequestMapping(value="/sevendate/{consNo}",method=RequestMethod.GET)
	public List<DateAmt> getAmtConsNo(@PathVariable String consNo){
		String dates="20151010";
		List<DateAmt> sevenAmt=this.dateAmtService.getDateAmtconsNo(consNo, dates);
		return sevenAmt;		
	}
	
	@ApiOperation(value = "获取7天总用电", notes = "根据户名和当前时间获取电量电费")  
	@RequestMapping(value="/total/{consNo}",method=RequestMethod.GET)
	public int getAmtAndConsNo(@PathVariable String consNo){
		String dates="20151010";
		int total=this.dateAmtService.getConsNoAndDates(consNo, dates);
		return total;
	}
}
