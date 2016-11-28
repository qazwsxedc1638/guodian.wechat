package org.hdkj.wechat.service.MyInfo;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.PowersOff;
import org.hdkj.wechat.dao.MyInfo.PowersOffMapper;
import org.hdkj.wechat.util.DateUtils;
import org.springframework.stereotype.Service;

@Service("powersOffService")
public class PowersOffService {
	
	@Resource
	private PowersOffMapper powersOffDao;
	
	public List<PowersOff> selectPowersOff(String orgNo){
		return powersOffDao.selectPowersOff(orgNo);
	}
	
	public List<PowersOff> selectPowersOffA(String orgNo,String type){
		Date today = new Date();
		String startTime = "";
		String stopDate = "";
		if(type !=null && !type.equals(""))
		{
			
			if(type.equals("0"))
			{
				startTime = DateUtils.dateToStr(today, "yyyy-MM-dd")+" 00:00:00";
				stopDate = DateUtils.dateToStr(DateUtils.addDay(today,1), "yyyy-MM-dd")+" 23:59:59";
				
			}else if(type.equals("1"))
			{
				startTime = DateUtils.dateToStr(new Date(), "yyyy-MM-dd")+" 00:00:00";
				stopDate = DateUtils.dateToStr(DateUtils.addDay(today,3), "yyyy-MM-dd")+" 23:59:59";
			}else if(type.equals("2"))
			{
				startTime = DateUtils.dateToStr(new Date(), "yyyy-MM-dd")+" 00:00:00";
				stopDate = DateUtils.dateToStr(DateUtils.addDay(today, 7), "yyyy-MM-dd")+" 23:59:59";
			}
		}else
		{
			startTime = DateUtils.dateToStr(today, "yyyy-MM-dd");
			stopDate = startTime;
		}
		return powersOffDao.selectPowersOffA(orgNo,startTime,stopDate);
	}
}
