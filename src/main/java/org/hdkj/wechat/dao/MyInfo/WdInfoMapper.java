package org.hdkj.wechat.dao.MyInfo;

import java.util.List;

import org.hdkj.wechat.bean.MyInfo.WdInfo;

public interface WdInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(WdInfo record);

    int insertSelective(WdInfo record);

    WdInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WdInfo record);

    int updateByPrimaryKey(WdInfo record);
    
    List<WdInfo> selectByRegionName(String regionName);
    
    List<WdInfo> selectByRegionCode(String regionCode);
    
    List<WdInfo> selectByPartCode(String regionCode);
}