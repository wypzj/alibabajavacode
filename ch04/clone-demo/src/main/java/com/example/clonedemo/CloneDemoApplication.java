package com.example.clonedemo;

import com.mchange.v2.ser.SerializableUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@Slf4j
public class CloneDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloneDemoApplication.class, args);
    }

    @Test
    public void testClone(){
        Order order = OrderFactory.orderMockeBuilder();
        Order clone = (Order) order.clone();
        log.info("{}",order.clone().getClass() == order.getClass());
        log.info("{}",order == clone);
        log.info("{}",order.getItems() == clone.getItems());

        try {
            Order o = (Order) SerializableUtils.deepCopy(order);
            log.info("{}",o.getClass() == order.getClass());
            log.info("{}",order == o);
            log.info("{}",order.getItems() == o.getItems());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
