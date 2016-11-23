package org.hdkj.wechat.service.CityCounty;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.CityCounty.City;
import org.hdkj.wechat.dao.CityCounty.CityMapper;
import org.springframework.stereotype.Service;

@Service("cityService")
public class CityService {
	@Resource
	private CityMapper cityDao;
	
	public List<City> getByCityAndCounty(){	
		return cityDao.selectByCityAndCounty();		
	}
	
	public List<City> getByCity(){
		return cityDao.selectByCity();
	}
	
	public List<City> getByCityInfo(String city){
		return cityDao.selectByCityInfo(city);
	}
	
}
