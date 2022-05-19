package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SSMPApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("测试123");
        book.setType("测试12");
        book.setDescription("测试数据");
        bookDao.insert(book);
    }

    @Test
    public void testDeleteById(){
        bookDao.deleteById(54);
    }

    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(51);
        book.setName("测试abc");
        book.setType("测试abcdddd");
        book.setDescription("测试数据abcdffffff");
        bookDao.updateById(book);
    }

    @Test
    public void testGetById(){
        System.out.println(bookDao.selectById(12));
    }

    @Test
    public void testGetAll(){
        System.out.println(bookDao.selectList(null) );
    }

}
