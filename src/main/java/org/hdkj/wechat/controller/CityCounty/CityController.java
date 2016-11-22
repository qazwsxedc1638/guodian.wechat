package org.hdkj.wechat.controller.CityCounty;

import java.util.List;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.CityCounty.City;
import org.hdkj.wechat.service.CityCounty.CityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/citycounty")
public class CityController {
	@Resource
	private CityService cityService;
	
	@ApiOperation(value = "获取城市地区集合")
	@RequestMapping(value = "/county", method = RequestMethod.GET)
	public List<City> getByAndCounty(){
		List<City> County_list=this.cityService.getByCityAndCounty();
		return County_list;		
	}
	
	@ApiOperation(value = "获取城市集合")
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public List<City> getByAndCity(){
		List<City> city_list=this.cityService.getByCity();
		return city_list;
	}
	
	@ApiOperation(value = "获取指定城市的地区集合",notes = "根据城市名称")
	@RequestMapping(value = "/cityInfo/{city}", method = RequestMethod.GET)
	public List<City> getByAndCityInfo(@PathVariable String city){
		List<City> list=this.cityService.getByCityInfo(city);
		return list;
	}
}
 