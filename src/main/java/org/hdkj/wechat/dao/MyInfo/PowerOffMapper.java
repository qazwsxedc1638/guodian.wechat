package org.hdkj.wechat.dao.MyInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyInfo.PowerOff;

public interface PowerOffMapper {
    int deleteByPrimaryKey(String infoId);

    int insert(PowerOff record);

    int insertSelective(PowerOff record);

    PowerOff selectByPrimaryKey(String infoId);

    int updateByPrimaryKeySelective(PowerOff record);

    int updateByPrimaryKey(PowerOff record);
    
    List<PowerOff> selectByCity(String city);
    
    List<PowerOff> selectByCityAndDistrict(@Param("city")String city,@Param("district")String district);
}