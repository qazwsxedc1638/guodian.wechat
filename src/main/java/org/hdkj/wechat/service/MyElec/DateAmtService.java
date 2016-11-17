package org.hdkj.wechat.service.MyElec;


import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.DateAmt;
import org.hdkj.wechat.dao.MyElec.DateAmtMapper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("dateAmtService")
public class DateAmtService {
	@Resource
	private DateAmtMapper dateAmtDao;
	
	//查询最近7天电量
	@Transactional
	public List<DateAmt> getDateAmtSevenDay(String consNo){
		//String dates=DateUtils.dateToStr(new Date(), "yyyy-MM-dd");
		String dates="20151010";
		return this.dateAmtDao.selectByConsNoAndDate(consNo, dates);
	}
	//查询最近7天总电量
	@Transactional
	public int getConsNoAndDates(String consNo){
		//String dates=DateUtils.dateToStr(new Date(), "yyyy-MM-dd");
		String dates="20151010";
		return this.dateAmtDao.selectByTotal(consNo, dates);
	}
	
	//获取用户最近一个月的电量数据
	@Transactional
	public List<DateAmt> getDateAmtMonth(String consNo){		
		return this.dateAmtDao.selectByDateMonth(consNo);
		
	}
}
