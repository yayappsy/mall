package com.macro.mall.mapper;

import com.macro.mall.model.TestGenTable;
import com.macro.mall.model.TestGenTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestGenTableMapper {
    long countByExample(TestGenTableExample example);

    int deleteByExample(TestGenTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestGenTable record);

    int insertSelective(TestGenTable record);

    List<TestGenTable> selectByExampleWithBLOBs(TestGenTableExample example);

    List<TestGenTable> selectByExample(TestGenTableExample example);

    TestGenTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestGenTable record, @Param("example") TestGenTableExample example);

    int updateByExampleWithBLOBs(@Param("record") TestGenTable record, @Param("example") TestGenTableExample example);

    int updateByExample(@Param("record") TestGenTable record, @Param("example") TestGenTableExample example);

    int updateByPrimaryKeySelective(TestGenTable record);

    int updateByPrimaryKeyWithBLOBs(TestGenTable record);

    int updateByPrimaryKey(TestGenTable record);
}