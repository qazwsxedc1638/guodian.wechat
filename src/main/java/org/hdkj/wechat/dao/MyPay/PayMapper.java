package org.hdkj.wechat.dao.MyPay;

import java.util.List;

import org.hdkj.wechat.bean.MyPay.Pay;

public interface PayMapper {
    int deleteByPrimaryKey(Long chargeId);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(Long chargeId);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
    
    List<Pay> selectByPayConsNo(String consNo);
}