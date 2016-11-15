package org.hdkj.wechat.controller;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.User;
import org.hdkj.wechat.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController  
@RequestMapping(value = "/users")
public class UserRestController {
	@Resource
	private UserService userService;
	
	
	@ApiOperation(value = "获取用户", notes = "根据用户id获取用户")  
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public User getUserById(@PathVariable int id){
		
		User user = this.userService.getUserById(id);
		return user;
	}
}
