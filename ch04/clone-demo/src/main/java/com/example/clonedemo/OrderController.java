package com.example.clonedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 卫云鹏
 * @date in 16:11 2019/12/4
 */
@RestController
@Slf4j
public class OrderController {
    @PostMapping("/post")
    public void postTest(@Valid @RequestBody Order order){
      log.info("{}",order.toString());
    }
}
