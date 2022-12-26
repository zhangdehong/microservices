package com.hong.customer.register;

import com.hong.customer.entity.Customer;

/**
 * @Author: ZhangDeHong
 * @Describe: TODO
 * @Date Create by  21:09 2022/12/24
 */
public record CustomerRegistrationRequest(Integer id,
                                          String firstName,
                                          String lastName,
                                          String name,
                                          String email
) {


}
