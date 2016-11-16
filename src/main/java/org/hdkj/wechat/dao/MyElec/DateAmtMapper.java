package org.hdkj.wechat.dao.MyElec;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hdkj.wechat.bean.MyElec.DateAmt;

public interface DateAmtMapper {
    int deleteByPrimaryKey(String quantityId);

    int insert(DateAmt record);

    int insertSelective(DateAmt record);

    DateAmt selectByPrimaryKey(String quantityId);

    int updateByPrimaryKeySelective(DateAmt record);

    int updateByPrimaryKey(DateAmt record);
    
    List<DateAmt> selectByConsNoAndDate(@Param ("consNo")String consNo,@Param("dates") String dates);
    
    int selectByTotal (@Param ("consNo")String consNo,@Param("dates") String dates);
}