package org.hdkj.wechat.dao.MyAccount;

import java.util.List;

import org.hdkj.wechat.bean.MyAccount.Cons;

public interface ConsMapper {
    int deleteByPrimaryKey(Long consId);

    int insert(Cons record);

    int insertSelective(Cons record);

    Cons selectByPrimaryKey(Long consId);

    int updateByPrimaryKeySelective(Cons record);

    int updateByPrimaryKey(Cons record);
    
    List<Cons> selectByConsNo(String consNo);
    
    List<Cons> selectByConsNoA(String consNo);
}