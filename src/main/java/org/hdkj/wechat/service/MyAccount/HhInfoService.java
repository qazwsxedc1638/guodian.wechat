package org.hdkj.wechat.service.MyAccount;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.dao.MyAccount.HhInfoMapper;
import org.springframework.stereotype.Service;
import org.hdkj.wechat.bean.MyAccount.HhInfo;

@Service("hhInfoService")
public class HhInfoService {
	
	@Resource
	private HhInfoMapper hhInfoDao;
	
	public List<HhInfo> getByWx(String wx){
		return hhInfoDao.selectByWx(wx);
	}
	
	public List<HhInfo> getByHh(String hh,String bindstatus){
		return hhInfoDao.selectByHh(hh,bindstatus);
	}
	
	public Integer countByWx(String wx,String bindstatus){
		return hhInfoDao.countByWx(wx, bindstatus);
	}
	
	public Integer countByHh(String hh,String bindstatus){
		return hhInfoDao.countByHh(hh, bindstatus);
	}
	
	public Integer bindDefaultHhById(String id,String bindstatus){
		return hhInfoDao.bindDefaultHhById(id, bindstatus);
	}
	
	public Integer releaseDefaultHhByWx(String wx,String bindstatus){
		return hhInfoDao.releaseDefaultHhByWx(wx, bindstatus);
	}
	
	public Integer countByWxAndHh(String wx,String hh,String bindstatus){
		return hhInfoDao.countByWxAndHh(wx, hh, bindstatus);
	}
	
	public Integer bindHh(String bindstatus,String state,String wx,String hh){
		return hhInfoDao.bindHh(bindstatus, state, wx, hh);
	}
	
	public Integer insertHh(HhInfo record){
		return hhInfoDao.insertHh(record);
	}
	
	public Integer deleteByHh(String hh){
		return hhInfoDao.deleteByHh(hh);
	}
}
