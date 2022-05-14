package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// 创建mapper
@Mapper
public interface BookDao {
    @Select("select * from t_user where id = #{id}")
    public Book getBookById(int id);
}
