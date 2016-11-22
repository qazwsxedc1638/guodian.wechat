package org.hdkj.wechat.service.CityCounty;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hdkj.wechat.bean.CityCounty.ORGCompany;
import org.hdkj.wechat.dao.CityCounty.ORGCompanyMapper;
import org.springframework.stereotype.Service;





@Service("orgCompanyService")
public class ORGCompanyService {
	@Resource
	public ORGCompanyMapper ORGCompanyDao;
	
	public String getByOrg(String orgNo){
		Map<String,Object> map=new HashMap<String,Object>();
		String name=this.ORGCompanyDao.selectByPrimaryKey(orgNo);
		List<ORGCompany> org_list= this.ORGCompanyDao.selectByPorgNo(orgNo);		
		map.put(name, org_list);
		JSONObject json = JSONObject.fromObject(map);	
		return json.toString();		
	}
	
	public String getByPorgNo(String PorgNo){
		Map<String,Object> PorgMap=new HashMap<String,Object>();
		String name=this.ORGCompanyDao.selectByPorgKey(PorgNo);
		List<ORGCompany> list=this.ORGCompanyDao.selectByPorgNo(PorgNo);
		PorgMap.put(name, list);
		JSONObject jsonArray2 = JSONObject.fromObject(PorgMap);
		return jsonArray2.toString();
	}
}
