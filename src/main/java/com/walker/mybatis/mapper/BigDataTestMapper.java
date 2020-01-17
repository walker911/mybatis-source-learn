package com.walker.mybatis.mapper;

import com.walker.mybatis.model.BigDataTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/1/13
 */
@Mapper
public interface BigDataTestMapper {

    @Select("select id, name, age, email from big_data_test where id > #{id}")
    List<BigDataTest> findByPage(@Param("id") Integer id, RowBounds rb);

    @Select("select id, name, age, email from big_data_test")
    List<BigDataTest> findAll();
}
