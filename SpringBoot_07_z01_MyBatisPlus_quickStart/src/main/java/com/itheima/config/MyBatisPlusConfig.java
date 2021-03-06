package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 1. 创建MybatisPlusInterceptor拦截器对象
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 2. 添加分页拦截器
        interceptor .addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor ;
    }
}
