package org.hdkj.wechat.dao.CityCounty;

import java.util.List;

import org.hdkj.wechat.bean.CityCounty.ORGCompany;

public interface ORGCompanyMapper {
    int deleteByPrimaryKey(String orgNo);

    int insert(ORGCompany record);

    int insertSelective(ORGCompany record);
    int updateByPrimaryKeySelective(ORGCompany record);

    int updateByPrimaryKey(ORGCompany record);

    String selectByPrimaryKey(String orgNo);
    
    String selectByPorgKey(String PorgNo);
    
    List<ORGCompany> selectByPorgNo(String orgNo);
    
}