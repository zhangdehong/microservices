package com.hong.customer.controller;

import com.hong.customer.register.CustomerRegistrationRequest;
import com.hong.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhangDeHong
 * @Describe: TODO
 * @Date Create by  21:02 2022/12/24
 */
@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record Controller(CustomerService customerService) {

    public void registerCustomer (@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info(" new customer registration {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
