package org.hdkj.wechat.service.MyInfo;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.PowerOff;
import org.hdkj.wechat.dao.MyInfo.PowerOffMapper;
import org.springframework.stereotype.Service;

@Service("powerOffService")
public class PowerOffService {
	
	@Resource
	private PowerOffMapper powerOffDao;
	
	public List<PowerOff> selelctByCity(String city){
		return powerOffDao.selectByCity(city);
	}
	
	public List<PowerOff> selectByCityAndDistrict(String city,String district){
		return powerOffDao.selectByCityAndDistrict(city, district);
	}
	
	public PowerOff selectByPrimaryKey(String infoId){
		return powerOffDao.selectByPrimaryKey(infoId);
	}
}
