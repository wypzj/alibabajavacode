package com.example.clonedemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 14:50 2019/12/4
 */
public class OrderFactory {
    public static Order orderMockeBuilder(){
        List<Item> items = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Item item = new Item((long) i,"item"+i,new BigDecimal(99.0),new Date());
            items.add(item);
        }
       return new Order(1L, "order1", new Date(), items);
    }
}
