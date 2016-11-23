package org.hdkj.wechat.service.MyPay;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyPay.Pay;
import org.hdkj.wechat.dao.MyPay.PayMapper;
import org.springframework.stereotype.Service;

@Service("payService")
public class PayService {
	@Resource
	private PayMapper payDao;
	
	public List<Pay> getPayConsNo(String consNo){
		if(consNo!=null && !consNo.equals("")){
			return this.payDao.selectByPayConsNo(consNo);
		}
		return null;
		
	}
	
}
