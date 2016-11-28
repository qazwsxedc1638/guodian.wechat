package org.hdkj.wechat.dao.MyAccount;

import org.hdkj.wechat.bean.MyAccount.RecordMaintain;

public interface RecordMaintainMapper {
    int deleteByPrimaryKey(String consNo);

    int insert(RecordMaintain record);

    int insertSelective(RecordMaintain record);

    RecordMaintain selectByPrimaryKey(String consNo);

    int updateByPrimaryKeySelective(RecordMaintain record);

    int updateByPrimaryKey(RecordMaintain record);
}