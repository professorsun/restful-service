package com.uocloud.demo.mapper;

import com.uocloud.demo.model.User;
import org.apache.ibatis.annotations.*;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
     User findUser(@PathVariable String username);
    @Select("select * from user ")
    List<User> getallusers();

    @Insert("insert into user (username,password) values (#{username},#{password})")
    void adduser(String username, String password);

    @Update("update user set password=#{password} where username=#{username}")
    void updateuser(String username,String password);

    @Delete("delete  from user where username=#{username}")
    void deleteuser(String username);
}
