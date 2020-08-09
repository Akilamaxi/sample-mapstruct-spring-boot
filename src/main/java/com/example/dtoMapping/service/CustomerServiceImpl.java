package com.example.dtoMapping.service;

import com.example.dtoMapping.mapper.CustomerMapper;
import com.example.dtoMapping.model.domain.Customer;
import com.example.dtoMapping.model.dto.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    Logger log = LoggerFactory.getLogger(CustomerService.class);

    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO){
        final Customer customer = customerMapper.toEntity(customerDTO);
        return customerMapper.toDto(customer);

    }
}
