package org.hdkj.wechat.dao.MyElec;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyElec.YDFX;

public interface YDFXMapper {

	int insert(YDFX record);

    int insertSelective(YDFX record);
    
    List<YDFX> selectByYDFXconsNo(@Param("consNo") String consNo,@Param("startTime") String startTime,@Param("today_str") String today_str);
}