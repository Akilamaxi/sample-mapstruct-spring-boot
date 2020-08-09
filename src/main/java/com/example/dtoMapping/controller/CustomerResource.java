package com.example.dtoMapping.controller;

import com.example.dtoMapping.model.dto.CustomerDTO;
import com.example.dtoMapping.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@RequestMapping("/api")
@RestController
public class CustomerResource {

    Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public CustomerDTO post(@RequestBody CustomerDTO customerDTO){
        log.info("invoking customer save with | {}",customerDTO);
        return customerService.save(customerDTO);
    }
}
