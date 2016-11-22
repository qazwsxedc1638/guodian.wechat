package org.hdkj.wechat.controller.MyInfo;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.PowerOff;
import org.hdkj.wechat.service.MyInfo.PowerOffService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerOffController {
	
	@Resource
	private PowerOffService powerOffService;
	
	@ApiOperation(value = "查询停电信息",notes = "根据所在城市查询停电信息")
	@RequestMapping(value = "/powerOff/{city}",method = RequestMethod.GET)
	public List<PowerOff> getByCity(@PathVariable String city){
		return powerOffService.selelctByCity(city);
	}
	
	@ApiOperation(value = "查询停电信息",notes = "根据所在城市及地区查询停电信息")
	@RequestMapping(value = "/powerOff/{city}/{district}",method = RequestMethod.GET)
	public List<PowerOff> getByCityAndDistrict(@PathVariable String city,@PathVariable String district){
		return powerOffService.selectByCityAndDistrict(city, district);
	}
	
	@ApiOperation(value = "查询停电信息",notes = "根据查询停电信息")
	@RequestMapping(value = "/powerOffById/{infoId}",method = RequestMethod.GET)
	public PowerOff getByInfoId(@PathVariable String infoId){
		return powerOffService.selectByPrimaryKey(infoId);
	}
}
 