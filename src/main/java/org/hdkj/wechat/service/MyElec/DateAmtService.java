package org.hdkj.wechat.service.MyElec;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.DateAmt;
import org.hdkj.wechat.dao.MyElec.DateAmtMapper;
import org.springframework.stereotype.Service;

@Service("dateAmtService")
public class DateAmtService {
	@Resource
	private DateAmtMapper dateAmtDao;
	
	//查询最近7天电量
	public List<DateAmt> getDateAmtconsNo(String consNo,String dates){
		return this.dateAmtDao.selectByConsNoAndDate(consNo, dates);
	}
	//查询最近7天总电量
	public int getConsNoAndDates(String consNo,String dates){
		return this.dateAmtDao.selectByTotal(consNo, dates);
	}
}
