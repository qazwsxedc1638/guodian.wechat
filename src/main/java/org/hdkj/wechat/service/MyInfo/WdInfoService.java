package org.hdkj.wechat.service.MyInfo;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.WdInfo;
import org.hdkj.wechat.dao.MyInfo.WdInfoMapper;
import org.springframework.stereotype.Service;

@Service("wdInfoService")
public class WdInfoService {
	
	@Resource
	private WdInfoMapper wdInfoDao;
	
	public List<WdInfo> selectByRegionName(String regionName){
		return wdInfoDao.selectByRegionName(regionName);
	}
	
	public WdInfo selectByPrimaryKey(String id){
		return wdInfoDao.selectByPrimaryKey(id);
	}
	
	public List<WdInfo> selectByRegionCode(String regionCode){
		return wdInfoDao.selectByRegionCode(regionCode);
	}
}
