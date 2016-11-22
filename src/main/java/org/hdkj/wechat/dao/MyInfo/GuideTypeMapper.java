package org.hdkj.wechat.dao.MyInfo;

import java.util.List;

import org.hdkj.wechat.bean.MyInfo.GuideType;

public interface GuideTypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(GuideType record);

    int insertSelective(GuideType record);

    GuideType selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(GuideType record);

    int updateByPrimaryKey(GuideType record);
    
    List<GuideType> selectByPId(String pId);
}