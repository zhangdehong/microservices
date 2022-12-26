package com.hong.customer.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: ZhangDeHong
 * @Describe: TODO
 * @Date Create by  21:00 2022/12/24
 */
@Data
@Builder
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
