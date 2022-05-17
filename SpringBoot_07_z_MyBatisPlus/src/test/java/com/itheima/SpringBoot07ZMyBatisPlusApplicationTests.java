package com.itheima;

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
    void testSave(){
        User user = new User();
        user.setName("vstay");
        user.setAge(18);
        user.setPassword("123456");
        user.setTel("123");
        userDao.insert(user );
    }

    @Test
    void testDelete(){
        System.out.printf(""+userDao.deleteById("1526473739259129857"));
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("Bok");
        userDao.updateById(user);
    }

    @Test
    void testGetUserById(){
        System.out.println(""+userDao.selectById("1526471462624460802"));
    }

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
