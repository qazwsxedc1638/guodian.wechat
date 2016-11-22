package org.hdkj.wechat.service.MyInfo;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyInfo.GuideItem;
import org.hdkj.wechat.dao.MyInfo.GuideItemMapper;
import org.springframework.stereotype.Service;

@Service("guideItemService")
public class GuideItemService {
	
	@Resource
	private GuideItemMapper guideItemDao;
	
	public GuideItem selectByPrimaryKey(String itemId){
		return guideItemDao.selectByPrimaryKey(itemId);
	}
}
