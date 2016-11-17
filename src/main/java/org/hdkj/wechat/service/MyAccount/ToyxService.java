package org.hdkj.wechat.service.MyAccount;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.Toyx;
import org.hdkj.wechat.dao.MyAccount.ToyxMapper;
import org.springframework.stereotype.Service;

@Service("toyxService")
public class ToyxService {
	
	@Resource
	private ToyxMapper toyxDao;
	
	public Integer bindHhToyx(String bindstatus,String wx,String consNo){
		return toyxDao.bindHhToyx(bindstatus, wx, consNo);
	}
	
	public Integer insertHhToyx(Toyx record){
		return toyxDao.insertHhToyx(record);
	}
}
