package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// 创建mapper
@Mapper
public interface UserDao {
    @Select("select * from t_user where id = #{id}")
    public User getBookById(int id);
}
