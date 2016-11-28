package org.hdkj.wechat.controller.MyInfo;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.PowersOff;
import org.hdkj.wechat.service.MyInfo.PowersOffService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/powersOff")
public class PowersOffController {
	
	@Resource
	private PowersOffService powersOffService;
	
	@ApiOperation(value = "查询停电信息",notes = "根据所在城市编码查询停电信息")
	@RequestMapping(value = "/{orgNo}",method = RequestMethod.GET)
	public List<PowersOff> selectPowersOff(@PathVariable String orgNo){
		return powersOffService.selectPowersOff(orgNo);
	}
	
	@ApiOperation(value = "查询停电信息",notes = "根据所在城市编码和最近天数查询停电信息")
	@RequestMapping(value = "selectByDays/{orgNo}/{type}",method = RequestMethod.GET)
	public List<PowersOff> selectPowersOffA(@PathVariable String orgNo,@PathVariable String type){
		return powersOffService.selectPowersOffA(orgNo,type);
	}
}
