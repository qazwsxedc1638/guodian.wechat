package org.hdkj.wechat.controller.MyInfo;

import java.util.List;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;

import org.hdkj.wechat.bean.MyInfo.WdInfo;
import org.hdkj.wechat.service.MyInfo.WdInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wd")
public class WdInfoController {
	
	@Resource
	private WdInfoService wdInfoService;
	
	@ApiOperation(value = "查询网点信息",notes = "根据所在地区查询网点信息")
	@RequestMapping(value = "/wdInfo/{regionName}",method = RequestMethod.GET)
	public List<WdInfo> getByRegionName(@PathVariable String regionName){
		return wdInfoService.selectByRegionName(regionName);
	}
	
	@ApiOperation(value = "查询网点信息",notes = "根据id查询网点信息")
	@RequestMapping(value = "/wdInfoById/{id}",method = RequestMethod.GET)
	public WdInfo getById(@PathVariable String id){
		return wdInfoService.selectByPrimaryKey(id);
	}
	
	@ApiOperation(value = "查询网点信息",notes = "根据所在地区编码查询网点信息")
	@RequestMapping(value = "/wdInfoByCode/{regionCode}",method = RequestMethod.GET)
	public List<WdInfo> getByRegionCode(@PathVariable String regionCode){
		return wdInfoService.selectByRegionCode(regionCode);
	}
}
