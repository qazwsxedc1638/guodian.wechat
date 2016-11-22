package org.hdkj.wechat.dao.CityCounty;

import java.util.List;

import org.hdkj.wechat.bean.CityCounty.City;

public interface CityMapper {
 
    List<City> selectByCityAndCounty();
    
    List<City> selectByCity();
    
    List<City> selectByCityInfo(String city);
}