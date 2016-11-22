package org.hdkj.wechat.service.MyInfo;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.GuideType;
import org.hdkj.wechat.dao.MyInfo.GuideTypeMapper;
import org.springframework.stereotype.Service;

@Service("guideTypeService")
public class GuideTypeService {
	
	@Resource
	private GuideTypeMapper guideTypeDao;
	
	public List<GuideType> selectByPId(String pId){
		return guideTypeDao.selectByPId(pId);
	}
	
	public GuideType selectByPrimaryKey(String typeId){
		return guideTypeDao.selectByPrimaryKey(typeId);
	}
}
