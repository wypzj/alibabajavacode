package com.example.clonedemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 卫云鹏
 * @date in 14:45 2019/12/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable,Cloneable {
    private static final long serialVersionUID = 2956568445186777160L;
    @NotNull(message = "不能为空")
    private Long id;
    private String name;
    private Date createDate;
    private List<Item> items;

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
