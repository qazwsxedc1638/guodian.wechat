package org.hdkj.wechat.service.MyAccount;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.Cons;
import org.hdkj.wechat.dao.MyAccount.ConsMapper;
import org.springframework.stereotype.Service;

@Service("consService")
public class ConsService {
	
	@Resource
	private ConsMapper consDao;
	
	public List<Cons> selectByConsNo(String consNo){
		return consDao.selectByConsNo(consNo);
	}
	/*
	 * 获取户名 地址 编码
	 */
	public List<Cons> selectByConsNoA(String consNo){
		return consDao.selectByConsNoA(consNo);
	}
}
