package org.hdkj.wechat.dao.MyInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyInfo.PowersOff;

public interface PowersOffMapper {
    int insert(PowersOff record);

    int insertSelective(PowersOff record);
    
    List<PowersOff> selectPowersOff(String orgNo);
    
    List<PowersOff> selectPowersOffA(@Param("orgNo")String orgNo,@Param("startTime")String startTime,@Param("stopDate")String stopDate);
}