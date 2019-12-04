package com.example.clonedemo;

import lombok.Data;

/**
 * @author 卫云鹏
 * @date in 16:18 2019/12/4
 */
@Data
public class MyException extends RuntimeException {
    private String code;
    private String message;

    public MyException(String code,String message){
        this.code = code;
        this.message = message;
    }

}
