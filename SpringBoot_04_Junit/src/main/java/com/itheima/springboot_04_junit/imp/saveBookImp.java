package com.itheima.springboot_04_junit.imp;

import com.itheima.springboot_04_junit.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class saveBookImp implements BookDao {
    @Override
    public void saveBook() {
        System.out.println("bookDao is running...");
    }
}
