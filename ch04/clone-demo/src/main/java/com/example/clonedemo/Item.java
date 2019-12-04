package com.example.clonedemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 卫云鹏
 * @date in 14:46 2019/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {
    private static final long serialVersionUID = -2709454934545193860L;
    private Long id;
    private String itemName;
    private BigDecimal price;
    private Date createDate;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                '}';
    }
}
