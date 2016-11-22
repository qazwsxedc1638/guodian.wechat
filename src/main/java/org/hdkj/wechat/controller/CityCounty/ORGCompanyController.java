package org.hdkj.wechat.controller.CityCounty;


import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;

import org.hdkj.wechat.service.CityCounty.ORGCompanyService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/orgInfo",produces = "text/html;charset=UTF-8")
public class ORGCompanyController {
	@Resource
	private ORGCompanyService orgCompanyService;
	
	@ApiOperation(value = "获取供电公司信息",notes = "根据供电单位编号")
	@RequestMapping(value = "/orgNo/{orgNo}", method = RequestMethod.GET)
	public String getByAndOrgNo(@PathVariable String orgNo){
		return this.orgCompanyService.getByOrg(orgNo);
	}
	
	@ApiOperation(value = "获取下一级供电营业所",notes = "根据上一级供电单位编号")
	@RequestMapping(value = "/PorgNo/{PorgNo}", method = RequestMethod.GET)
	public String getByAndPorgNo(@PathVariable String PorgNo){
		return this.orgCompanyService.getByPorgNo(PorgNo);
	}
}
