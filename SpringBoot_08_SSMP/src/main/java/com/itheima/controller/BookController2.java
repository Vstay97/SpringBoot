package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }

    /**
     * 增加操作
     */
    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    /**
     * 修改操作
     */
    @PutMapping
    public boolean update(@RequestBody Book book){
        return bookService.updateById(book);
    }

    /**
     * 删除操作
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    /**
     * 单个查询
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    /**
     * 分页查询
     */
    @GetMapping("/{current}/{size}")
    public IPage<Book> getPage(@PathVariable Integer current, @PathVariable Integer size,Book book){
        return bookService.getPage(current,size,book);
    }



}
