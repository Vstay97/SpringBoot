package com.itheima.controller.util;

import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;

    public R(boolean flag) {
        this.flag = flag;
    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
