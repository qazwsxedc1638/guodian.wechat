package org.hdkj.wechat.dao.MyElec;

import java.math.BigDecimal;

import org.hdkj.wechat.bean.MyElec.Balance;

public interface BalanceMapper {
    int deleteByPrimaryKey(Long acctId);

    int insert(Balance record);

    int insertSelective(Balance record);

    Balance selectByPrimaryKey(Long acctId);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
    
    BigDecimal selectByPrimaryConsNo(String consNo);
}