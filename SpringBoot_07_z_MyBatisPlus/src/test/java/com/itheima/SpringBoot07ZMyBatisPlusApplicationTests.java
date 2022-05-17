package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBoot07ZMyBatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSelectPage() {
        // 1. 创建IPage分页对象,设置分页参数,1为当前页码，3为每页显示的记录数
        IPage<User> page = new Page<>(1, 2);
        // 2. 执行分页查询
        userDao.selectPage(page, null);
        System.out.println("当前页码值: " + page.getCurrent());
        System.out.println("每页显示数: " + page.getSize());
        System.out.println("一共多少页: " + page.getPages());
        System.out.println("一共多少条数据: " + page.getTotal());
        System.out.println("数据: " + page.getRecords());

    }

    @Test
    void testSave() {
        User user = new User();
        user.setName("vstay");
        user.setAge(18);
        user.setPassword("123456");
        user.setTel("123");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        System.out.printf("" + userDao.deleteById("1526473739259129857"));
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(1L);
        user.setName("Bok");
        userDao.updateById(user);
    }

    @Test
    void testGetUserById() {
        System.out.println("" + userDao.selectById("1526471462624460802"));
    }

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
