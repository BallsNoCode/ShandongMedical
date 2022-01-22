package com.kkb.mapper;

import com.kkb.pojo.Behospital;
import com.kkb.pojo.BehospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BehospitalMapper {
    long countByExample(BehospitalExample example);

    int deleteByExample(BehospitalExample example);

    int deleteByPrimaryKey(Integer beH_id);

    int insert(Behospital record);

    int insertSelective(Behospital record);

    List<Behospital> selectByExample(BehospitalExample example);

    Behospital selectByPrimaryKey(Integer beH_id);

    int updateByExampleSelective(@Param("record") Behospital record, @Param("example") BehospitalExample example);

    int updateByExample(@Param("record") Behospital record, @Param("example") BehospitalExample example);

    int updateByPrimaryKeySelective(Behospital record);

    int updateByPrimaryKey(Behospital record);
}