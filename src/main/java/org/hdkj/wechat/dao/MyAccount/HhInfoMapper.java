package org.hdkj.wechat.dao.MyAccount;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyAccount.HhInfo;

public interface HhInfoMapper {
    int deleteByPrimaryKey(String id);

	int insert(HhInfo record);

	int insertSelective(HhInfo record);

	HhInfo selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(HhInfo record);

	int updateByPrimaryKey(HhInfo record);
    
    List<HhInfo> selectByWx(String wx);
    
    List<HhInfo> selectByHh(@Param("hh") String hh,@Param("bindstatus")String bindstatus);
    
    Integer countByWx(@Param("wx") String wx,@Param("bindstatus")String bindstatus);
    
    Integer countByHh(@Param("hh") String hh,@Param("bindstatus")String bindstatus);
    
    Integer bindDefaultHhById(@Param("id") String id,@Param("bindstatus")String bindstatus);
    
    Integer releaseDefaultHhByWx(@Param("wx") String wx,@Param("bindstatus")String bindstatus);
    
    Integer countByWxAndHh(@Param("wx") String wx,@Param("hh") String hh,@Param("bindstatus")String bindstatus);
    
    Integer bindHh(@Param("bindstatus")String bindstatus,@Param("state")String state,@Param("wx") String wx,@Param("hh") String hh);
    
    Integer insertHh(HhInfo record);
    
    Integer deleteByHh(String hh);
}