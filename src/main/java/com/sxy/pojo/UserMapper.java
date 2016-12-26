package com.sxy.pojo;

import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/12/26.
 */
@Mapper
@Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = {IllegalArgumentException.class})
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME=#{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAEM,AGE)VALUES(#{name},#{age})")
    Integer addUser(@Param("name") String name, @Param("age") Integer age);
}
