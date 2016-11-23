package org.hdkj.wechat.controller.MyAccount;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.HhInfo;
import org.hdkj.wechat.service.MyAccount.HhInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hh")
public class HhInfoRestController {
	
	@Resource
	private HhInfoService hhInfoService;
	
	@ApiOperation(value = "获取用户信息", notes = "根据用户微信id获取用户") 
	@RequestMapping(value = "/hhInfo/{wx}", method = RequestMethod.GET) 
	public List<HhInfo> getByWxInfo(@PathVariable String wx){
		List<HhInfo> hhInfoList = hhInfoService.getByWx(wx);
		return hhInfoList;
	}
	
	@ApiOperation(value = "获取用户信息", notes = "根据用户户号获取用户") 
	@RequestMapping(value = "/hhInfoHh/{hh}/{bindstatus}", method = RequestMethod.GET) 
	public List<HhInfo> getByHhInfo(@PathVariable String hh,@PathVariable String bindstatus){
		List<HhInfo> hhInfoList = hhInfoService.getByHh(hh,bindstatus);
		return hhInfoList;
	}
	
	@ApiOperation(value = "获取绑定用户信息数量", notes = "根据用户微信和绑定状态获取绑定用户信息数量")
	@RequestMapping(value = "/countHhInfo/{wx}/{bindstatus}", method = RequestMethod.GET) 
	public Integer getByWx(@PathVariable String wx,@PathVariable String bindstatus){
		Integer count = hhInfoService.countByWx(wx, bindstatus);
		return count;
	}
	
	@ApiOperation(value = "获取绑定用户信息数量",notes = "根据用户户号和绑定状态获取绑定用户信息数量")
	@RequestMapping(value = "/countHhInfoByHh/{hh}/{bindstatus}",method = RequestMethod.GET)
	public Integer getByHh(@PathVariable String hh,@PathVariable String bindstatus){
		Integer count = hhInfoService.countByHh(hh, bindstatus);
		return count;
	}
	
	@ApiOperation(value = "设置默认户号",notes = "根据用户id设置默认户号")
	@RequestMapping(value = "/setDefaultHh/{id}/{bindstatus}",method = RequestMethod.PUT)
	public Integer setDefaultHh(@PathVariable String id,@PathVariable String bindstatus){
		Integer count = hhInfoService.bindDefaultHhById(id, bindstatus);
		return count;
	}
	
	@ApiOperation(value = "修改默认户号",notes = "根据用户id和微信号修改默认户号")
	@RequestMapping(value = "/modifyDefaultHh/{id}/{wx}/{bindstatus}",method = RequestMethod.PUT)
	public Integer modifyDefaultHh(@PathVariable String id,@PathVariable String wx,@PathVariable String bindstatus){
		Integer count1 = hhInfoService.releaseDefaultHhByWx(wx, bindstatus);
		Integer count = hhInfoService.bindDefaultHhById(id, bindstatus);
		return count1-count;
	}
	
	@ApiOperation(value = "获取绑定用户信息数量",notes = "根据用户微信号,户号和绑定状态获取绑定用户信息数量")
	@RequestMapping(value = "/countHhByWxAndHh/{wx}/{hh}/{bindstatus}",method = RequestMethod.GET)
	public Integer countByWxAndHh(@PathVariable String wx,@PathVariable String hh,@PathVariable String bindstatus){
		return hhInfoService.countByWxAndHh(wx, hh, bindstatus);
	}
	
	@ApiOperation(value = "设置用户绑定状态",notes = "根据用户微信号,户号设置用户绑定状态")
	@RequestMapping(value = "/bindHh/{bindstatus}/{state}/{wx}/{hh}",method = RequestMethod.PUT)
	public Integer bindHh(@PathVariable String bindstatus,@PathVariable String state,@PathVariable String wx,@PathVariable String hh){
		return hhInfoService.bindHh(bindstatus, state, wx, hh);
	}
	
	@ApiOperation(value = "新增用户",notes = "根据用户信息新增用户")
	@RequestMapping(value = "/insertHh",method = RequestMethod.POST)
	public Integer insertHh(@RequestBody HhInfo hhInfo){
		return hhInfoService.insertHh(hhInfo);
	}
}
