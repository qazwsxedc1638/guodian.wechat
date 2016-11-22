package org.hdkj.wechat.controller.MyInfo;

import java.util.List;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.GuideType;
import org.hdkj.wechat.service.MyInfo.GuideTypeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuideTypeController {
	
	@Resource
	private GuideTypeService guideTypeService;
	
	@ApiOperation(value = "查询服务咨询标题",notes = "根据PId查询标题")
	@RequestMapping(value = "/guideType/{pId}",method = RequestMethod.GET)
	public List<GuideType> selectByPId(@PathVariable String pId){
		return guideTypeService.selectByPId(pId);
	}
	
	@ApiOperation(value = "查询服务咨询信息",notes = "根据typeId查询服务咨询信息")
	@RequestMapping(value = "/guideTypeById/{typeId}",method = RequestMethod.GET)
	public GuideType selectByTypeId(@PathVariable String typeId){
		return guideTypeService.selectByPrimaryKey(typeId);
	}
}
