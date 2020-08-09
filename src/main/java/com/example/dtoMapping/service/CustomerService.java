package com.example.dtoMapping.service;

import com.example.dtoMapping.model.dto.CustomerDTO;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
public interface CustomerService {

    CustomerDTO save(CustomerDTO customerDTO);
}
