package com.grade.mapper;

import com.grade.entity.AppOrder;
import com.grade.entity.AppOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppOrderMapper {
    long countByExample(AppOrderExample example);

    int deleteByExample(AppOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppOrder record);

    int insertSelective(AppOrder record);

    List<AppOrder> selectByExample(AppOrderExample example);

    AppOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    int updateByExample(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    int updateByPrimaryKeySelective(AppOrder record);

    int updateByPrimaryKey(AppOrder record);
}