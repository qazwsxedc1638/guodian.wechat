package org.hdkj.wechat.controller.MyAccount;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.Cons;
import org.hdkj.wechat.service.MyAccount.ConsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cons")
public class ConsController {
	
	@Resource
	private ConsService consService;
	
	@ApiOperation(value = "获取用户信息", notes = "根据用户户号取用户信息")
	@RequestMapping(value = "/{consNo}", method = RequestMethod.GET)
	public List<Cons> getByConsNo(@PathVariable String consNo){
		return consService.selectByConsNo(consNo);
	}
	
	@RequestMapping(value = "/consAnother/{consNo}", method = RequestMethod.GET)
	@ApiOperation(value = "获取用户信息", notes = "根据用户户号取用户信息") 
	public List<Cons> getByConsNoA(@PathVariable String consNo){
		return consService.selectByConsNoA(consNo);
	}
}
