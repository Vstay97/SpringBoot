package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.util.R;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    /**
     * 增加操作
     */
    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        Boolean flag = bookService.save(book);
        return new R(flag, flag ? "添加成功 ^_^" : "添加失败 -_-!");
    }

    /**
     * 修改操作
     */
    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.updateById(book));
    }

    /**
     * 删除操作
     */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.removeById(id));
    }

    /**
     * 单个查询
     */
    @GetMapping("/{id}")
    public R getBookById(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }

    /**
     * 分页查询
     */
    @GetMapping("/{current}/{size}")
    public R getPage(@PathVariable Integer current, @PathVariable Integer size) {
        IPage<Book> page= bookService.getPage(current,size);
        return new R(page != null, page);
    }
}
