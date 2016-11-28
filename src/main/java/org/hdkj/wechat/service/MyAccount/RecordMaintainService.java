package org.hdkj.wechat.service.MyAccount;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyAccount.RecordMaintain;
import org.hdkj.wechat.dao.MyAccount.RecordMaintainMapper;
import org.springframework.stereotype.Service;

@Service("recordMaintainService")
public class RecordMaintainService {
	
	@Resource
	private RecordMaintainMapper recordMaintainDao;
	
	public RecordMaintain selectPrimaryKey(String consNo){
		return recordMaintainDao.selectByPrimaryKey(consNo);
	}
	
	public int updateByPrimaryKey(RecordMaintain record){
		return recordMaintainDao.updateByPrimaryKey(record);
	}
}
