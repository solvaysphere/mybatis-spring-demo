package com.hpuswl.mybatis.spring.mapper;

import com.hpuswl.mybatis.spring.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from tb_user where id=#{id} ")
    User getUser(@Param("id")Long id);

    @Insert("insert into tb_user(user_name) values(#{userName})")
    void insertUser(User user);
}
