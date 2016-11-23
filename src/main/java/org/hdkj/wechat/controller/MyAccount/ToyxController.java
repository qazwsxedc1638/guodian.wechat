package org.hdkj.wechat.controller.MyAccount;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.Toyx;
import org.hdkj.wechat.service.MyAccount.ToyxService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/toyx")
public class ToyxController {
	
	@Resource
	private ToyxService toyxService;
	
	@ApiOperation(value = "绑定用户",notes = "根据用户信息绑定用户")
	@RequestMapping(value = "/bindHhToyx/{bindstatus}/{wx}/{consNo}",method = RequestMethod.PUT)
	public Integer bindHhToyx(@PathVariable String bindstatus,@PathVariable String wx,@PathVariable String consNo){
		return toyxService.bindHhToyx(bindstatus, wx, consNo);
	}
	
	@ApiOperation(value = "新增用户",notes = "根据用户信息新增用户")
	@RequestMapping(value ="/insertHhToyx",method = RequestMethod.POST)
	public Integer insertHhToyx(@RequestBody Toyx toyx){
		return toyxService.insertHhToyx(toyx);
	}
}
