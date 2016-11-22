package org.hdkj.wechat.controller.CustomerService;

import java.util.List;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.CustomerService.LeaveMsg;
import org.hdkj.wechat.service.CustomerService.LeaveMsgService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveMsgController {

	@Resource
	private LeaveMsgService leaveMsgService;
	
	@ApiOperation(value = "新增留言",notes = "根据记录新增留言")
	@RequestMapping(value = "/insertLeaveMsg",method = RequestMethod.POST)
	public Integer insertLeaveMsg(@RequestBody LeaveMsg record){
		return leaveMsgService.insertLeaveMsg(record);
	}
	
	@ApiOperation(value = "查询留言",notes = "根据微信id查询客户留言并按时间排序")
	@RequestMapping(value = "/selectLeaveMsg/{wxId}",method = RequestMethod.GET)
	public List<LeaveMsg> selectByWx(@PathVariable String wxId){
		return leaveMsgService.selectLeaveMsg(wxId);
	}
	
	@ApiOperation(value = "新增举报留言",notes = "新增举报留言")
	@RequestMapping(value = "/insertComplaint",method = RequestMethod.POST)
	public Integer insertComplaint(@RequestBody LeaveMsg record){
		return leaveMsgService.insertComplaint(record);
	}
	
	@ApiOperation(value = "查询举报留言",notes = "根据微信id查询客户举报留言并排序")
	@RequestMapping(value = "/selectComplaint/{wxId}",method = RequestMethod.GET)
	public List<LeaveMsg> selectComplaint(@PathVariable String wxId){
		return leaveMsgService.selectComplaint(wxId);
	}
	
	@ApiOperation(value = "新增求助留言",notes = "新增求助留言")
	@RequestMapping(value = "/insertHelpInfo",method = RequestMethod.POST)
	public Integer insertHelpInfo(@RequestBody LeaveMsg record){
		return leaveMsgService.insertHelpInfo(record);
	}
	
	@ApiOperation(value = "查询举报留言",notes = "根据微信id查询客户举报留言并排序")
	@RequestMapping(value = "/selectHelpInfo/{wxId}",method = RequestMethod.GET)
	public List<LeaveMsg> selectHelpInfo(@PathVariable String wxId){
		return leaveMsgService.selectHelpInfo(wxId);
	}
}
