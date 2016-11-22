package org.hdkj.wechat.dao.CustomerService;

import java.util.List;

import org.hdkj.wechat.bean.CustomerService.LeaveMsg;

public interface LeaveMsgMapper {
    int deleteByPrimaryKey(String msgId);

    int insert(LeaveMsg record);

    int insertSelective(LeaveMsg record);

    LeaveMsg selectByPrimaryKey(String msgId);

    int updateByPrimaryKeySelective(LeaveMsg record);

    int updateByPrimaryKey(LeaveMsg record);
    
    Integer insertLeaveMsg(LeaveMsg record);
    
    List<LeaveMsg> selectLeaveMsg(String wxId);
    
    Integer insertComplaint(LeaveMsg record);
    
    List<LeaveMsg> selectComplaint(String wxId);
    
    Integer insertHelpInfo(LeaveMsg record);
    
    List<LeaveMsg> selectHelpInfo(String wxId);
}