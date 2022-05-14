package com;

import com.itheima.SpringBoot04JunitApplication;
import com.itheima.springboot_04_junit.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBoot04JunitApplication.class)
class SpringBoot04JunitApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.saveBook();
    }

}
