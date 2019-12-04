package com.example.clonedemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 卫云鹏
 * @date in 16:20 2019/12/4
 */
@RestControllerAdvice(value = "com.example.clonedemo")
public class MyExceptionAdviceConvert {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> myExceptionHandle(Exception e){
        Map<String,String> returnMap = new HashMap<>();
        returnMap.put("code","400");
        returnMap.put("message",e.getMessage());
        return returnMap;
    }
}
