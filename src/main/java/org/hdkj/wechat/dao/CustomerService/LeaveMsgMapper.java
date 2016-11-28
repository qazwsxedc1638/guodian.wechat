package org.hdkj.wechat.dao.CustomerService;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
    
    Integer updateIsRead(@Param("wxId") String wxId,@Param("msgType") String msgType);
    
    Integer countByMsgType(@Param("wxId") String wxId,@Param("msgType") String msgType);
    
    List<LeaveMsg> selectMsg(@Param("wxId") String wxId,@Param("msgType") String msgType);
}