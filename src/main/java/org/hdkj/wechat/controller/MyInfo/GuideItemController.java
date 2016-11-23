package org.hdkj.wechat.controller.MyInfo;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;

import org.hdkj.wechat.bean.MyInfo.GuideItem;
import org.hdkj.wechat.service.MyInfo.GuideItemService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/guideItem")
public class GuideItemController {
	
	@Resource
	private GuideItemService guideItemService;
	
	@ApiOperation(value = "查询服务咨询信息",notes = "根据Id查询标题")
	@RequestMapping(value = "/{itemId}",method = RequestMethod.GET)
	public GuideItem selectByPrimaryKey(@PathVariable String itemId){
		return guideItemService.selectByPrimaryKey(itemId);
	}
}
