package org.hdkj.wechat.service.MyElec;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyElec.DLDF;
import org.hdkj.wechat.bean.MyElec.Jtdl;
import org.hdkj.wechat.dao.MyElec.BalanceMapper;
import org.hdkj.wechat.dao.MyElec.DLDFMapper;
import org.hdkj.wechat.dao.MyElec.JtdlMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("dldfService")
public class DLDFService {

	@Resource
	private DLDFMapper dldfDao;
	@Resource
	private BalanceMapper balanceDao;
	@Resource
	private JtdlMapper JtdlDao;
	
	
	//查询电量和电费
	@Transactional
	public List<DLDF> getDLDFbyConsnoAndDate(String consNo,String rcvblYm){
		if(consNo !=null && !consNo.equals("")){
			return this.dldfDao.selectByConsnoAndDate(consNo,rcvblYm);
		}
		return null;
	}
	
	//查询当前余额
	@Transactional
	public BigDecimal getConsNo(String consNo){
		if(consNo!=null && !consNo.equals("")){
			return this.balanceDao.selectByPrimaryConsNo(consNo);
		}
		return null;	
	}
	
	//阶梯电量查询
	@Transactional
	public List<Jtdl> getTimeAndConsNo(String time,String consNo){
		if(consNo !=null && !consNo.equals("")){
			return this.JtdlDao.selectByJtdlConsNOAndDate(time, consNo);
		}
		return null;
	}
}
