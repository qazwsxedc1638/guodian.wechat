package org.hdkj.wechat.service.CityCounty;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.hdkj.wechat.bean.CityCounty.ORGCompany;
import org.hdkj.wechat.dao.CityCounty.ORGCompanyMapper;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;





@Service("orgCompanyService")
public class ORGCompanyService {
	@Resource
	public ORGCompanyMapper ORGCompanyDao;
	
	public String getByOrg(String orgNo){
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> map=new HashMap<String,Object>();
		String name=this.ORGCompanyDao.selectByPrimaryKey(orgNo);
		List<ORGCompany> org_list= this.ORGCompanyDao.selectByPorgNo(orgNo);		
		map.put(name, org_list);
		String json="";
		try {
			json = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;		
	}
	
	public String getByPorgNo(String PorgNo){
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> PorgMap=new HashMap<String,Object>();
		String name=this.ORGCompanyDao.selectByPorgKey(PorgNo);
		List<ORGCompany> list=this.ORGCompanyDao.selectByPorgNo(PorgNo);
		PorgMap.put(name, list);
		String json_list="";
		try {
			json_list = mapper.writeValueAsString(PorgMap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json_list;		
	}

}
