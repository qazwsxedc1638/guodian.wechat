package org.hdkj.wechat.dao.MyInfo;

import org.hdkj.wechat.bean.MyInfo.GuideItem;

public interface GuideItemMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(GuideItem record);

    int insertSelective(GuideItem record);

    GuideItem selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(GuideItem record);

    int updateByPrimaryKey(GuideItem record);
}