package org.hdkj.wechat.service.CustomerService;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.CustomerService.LeaveMsg;
import org.hdkj.wechat.dao.CustomerService.LeaveMsgMapper;
import org.springframework.stereotype.Service;

@Service("leaveMsgService")
public class LeaveMsgService {
	
	@Resource
	private LeaveMsgMapper leaveMsgDao;
	
	public Integer insertLeaveMsg(LeaveMsg record){
		return leaveMsgDao.insertLeaveMsg(record);
	}
	
	public List<LeaveMsg> selectLeaveMsg(String wxId){
		return leaveMsgDao.selectLeaveMsg(wxId);
	}
	
	public Integer insertComplaint(LeaveMsg record){
		return leaveMsgDao.insertComplaint(record);
	}
	
	public List<LeaveMsg> selectComplaint(String wxId){
		return leaveMsgDao.selectComplaint(wxId);
	}
	
	public Integer insertHelpInfo(LeaveMsg record){
		return leaveMsgDao.insertHelpInfo(record);
	}
	
	public List<LeaveMsg> selectHelpInfo(String wxId){
		return leaveMsgDao.selectHelpInfo(wxId);
	}
	
	public Integer updateIsRead(String wxId,String msgType){
		return leaveMsgDao.updateIsRead(wxId, msgType);
	}
	
	public Integer countByMsgType(String wxId,String msgType){
		return leaveMsgDao.countByMsgType(wxId, msgType);
	}
	
	public List<LeaveMsg> selectMsg(String wxId,String msgType){
		return leaveMsgDao.selectMsg(wxId, msgType);
	}
}
