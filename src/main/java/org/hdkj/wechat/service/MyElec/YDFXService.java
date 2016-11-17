package org.hdkj.wechat.service.MyElec;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.YDFX;
import org.hdkj.wechat.dao.MyElec.YDFXMapper;
import org.hdkj.wechat.util.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ydfxService")
public class YDFXService {
	@Resource
	private YDFXMapper YDFXDao;
	
	//查询一年用电分析
	@Transactional
	public List<YDFX> getByYDFXConsNo(String consNo){
		Date today = new Date();
		String startTime = DateUtils.dateToStr(DateUtils.addMonth(today, -12), "yyyyMM");
		String today_str = DateUtils.dateToStr(today, "yyyyMM");
		if(consNo!=null && !consNo.equals("")){
			return this.YDFXDao.selectByYDFXconsNo(consNo, startTime, today_str);
		}
		return null;
		
	}

}
