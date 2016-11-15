package org.hdkj.wechat.service.MyElec;

import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.DLDF;
import org.hdkj.wechat.dao.MyElec.DLDFMapper;
import org.springframework.stereotype.Service;

@Service("dldfService")
public class DLDFService {

	@Resource
	private DLDFMapper dldfDao;
	
	public DLDF getDLDFbyId(Long rcvblAmtId){
		return this.dldfDao.selectByPrimaryKey(rcvblAmtId);
	}
	
	public List<DLDF> getDLDFbyConsnoAndDate(String consNo,String rcvblYm){
		return this.dldfDao.selectByConsnoAndDate(consNo,rcvblYm);
	}
}
