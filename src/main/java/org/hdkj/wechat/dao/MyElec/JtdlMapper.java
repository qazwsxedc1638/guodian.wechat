package org.hdkj.wechat.dao.MyElec;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyElec.Jtdl;

public interface JtdlMapper {
    int deleteByPrimaryKey(Long accuPqId);

    int insert(Jtdl record);

    int insertSelective(Jtdl record);

    Jtdl selectByPrimaryKey(Long accuPqId);

    int updateByPrimaryKeySelective(Jtdl record);

    int updateByPrimaryKey(Jtdl record);
    
    List<Jtdl> selectByJtdlConsNOAndDate(@Param("time")String time,@Param("consNo")String consNo);
}