package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTest {
    @Autowired
    private IBookService IBookService;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("测试 简易开发123");
        book.setType("测试 简易开发");
        book.setDescription("测试数据asdfgsdfdsa");
        System.out.println(IBookService.save(book));
    }

    @Test
    public void testDeleteById(){
        System.out.println(IBookService.removeById(57));
    }

    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(57);
        book.setName("测试 简易开发_123");
        book.setType("测试 简易开发");
        book.setDescription("测试数据zxc");
        System.out.println(IBookService.updateById(book));
    }

    @Test
    public void testGetById(){
        System.out.println(IBookService.getById(10));
    }

    @Test
    public void testGetAll(){
        System.out.println(IBookService.list() );
    }

    @Test
    public void testGetPage(){
        IPage<Book> page = new Page<>(2,5);
        page = IBookService.page(page);
        System.out.println("当前页: "+page.getCurrent());
        System.out.println("所有页: "+page.getPages());
        System.out.println("每页显示数: "+page.getSize());
        System.out.println("数据总数: "+page.getTotal());
        System.out.println("数据: "+page.getRecords());
    }
}
