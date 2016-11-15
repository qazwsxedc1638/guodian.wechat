package org.hdkj.wechat.dao.MyElec;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyElec.DLDF;

public interface DLDFMapper {
    int deleteByPrimaryKey(Long rcvblAmtId);

    int insert(DLDF record);

    int insertSelective(DLDF record);

    DLDF selectByPrimaryKey(Long rcvblAmtId);

    int updateByPrimaryKeySelective(DLDF record);

    int updateByPrimaryKey(DLDF record);
    
    List<DLDF> selectByConsnoAndDate(@Param("consNo")String consNo,@Param("rcvblYm")String rcvblYm);
}