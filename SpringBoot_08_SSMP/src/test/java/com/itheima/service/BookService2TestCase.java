package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookService2TestCase {
    @Autowired
    private BookService2 bookService2;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("测试SerivceSave123");
        book.setType("测试ServiceSave");
        book.setDescription("测试数据123123");
        System.out.println(bookService2.save(book));
    }

    @Test
    public void testDeleteById(){
        System.out.println(bookService2.delete(51));
    }

    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(55);
        book.setName("测试ServiceUpdate_abc");
        book.setType("测试ServiceUpdate");
        book.setDescription("测试数据");
        System.out.println(bookService2.update(book));
    }

    @Test
    public void testGetById(){
        System.out.println(bookService2.getById(12));
    }

    @Test
    public void testGetAll(){
        System.out.println(bookService2.getAll() );
    }

    @Test
    public void testGetPage(){
        IPage<Book> bookIPage = bookService2.getPage(2, 5);
        System.out.println("当前页: "+bookIPage.getCurrent());
        System.out.println("所有页: "+bookIPage.getPages());
        System.out.println("每页显示数: "+bookIPage.getSize());
        System.out.println("数据总数: "+bookIPage.getTotal());
        System.out.println("数据: "+bookIPage.getRecords());
    }
}
