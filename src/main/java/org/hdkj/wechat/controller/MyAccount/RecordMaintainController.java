package org.hdkj.wechat.controller.MyAccount;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.RecordMaintain;
import org.hdkj.wechat.service.MyAccount.RecordMaintainService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/recordMaintain")
public class RecordMaintainController {
	
	@Resource
	private RecordMaintainService recordMaintainService;
	
	@ApiOperation(value = "获取用户信息", notes = "根据用户户号获取用户信息") 
	@RequestMapping(value = "/get/{consNo}",method = RequestMethod.GET)
	public RecordMaintain selectByPrimaryKey(@PathVariable String consNo){
		return recordMaintainService.selectPrimaryKey(consNo);
	}
	
	@ApiOperation(value = "修改用户信息", notes = "根据用户户号更改用户信息") 
	@RequestMapping(value = "/update/{consNo}",method = RequestMethod.PUT)
	public int updateByPrimaryKey(@RequestBody RecordMaintain record){
		return recordMaintainService.updateByPrimaryKey(record);
	}
	
	public void getImages(){
		
	}
}
