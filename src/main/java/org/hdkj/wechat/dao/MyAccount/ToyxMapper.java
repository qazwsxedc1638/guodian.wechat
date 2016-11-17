package org.hdkj.wechat.dao.MyAccount;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyAccount.Toyx;

public interface ToyxMapper {
    int deleteByPrimaryKey(String detId);

    int insert(Toyx record);

    int insertSelective(Toyx record);

    Toyx selectByPrimaryKey(String detId);

    int updateByPrimaryKeySelective(Toyx record);

    int updateByPrimaryKey(Toyx record);
    
    Integer bindHhToyx(@Param("bindstatus")String bindstatus,@Param("wx") String wx,@Param("consNo") String cnosNo);
    
    Integer insertHhToyx(Toyx record);
}