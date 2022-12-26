package com.hong.customer.service;

import com.hong.customer.entity.Customer;
import com.hong.customer.register.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

/**
 * @Author: ZhangDeHong
 * @Describe: TODO
 * @Date Create by  21:15 2022/12/24
 */
@Service
public record CustomerService() {

    public void registerCustomer (CustomerRegistrationRequest request) {
        Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email valid;
        // todo: check if email not token
        // todo: check store customer in db
    }
}
