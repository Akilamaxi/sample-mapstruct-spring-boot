package com.example.dtoMapping.model.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@Data
@ToString
public class Customer {
    private String name;
    private Integer age;
    private Long customerId;
    private Address address;
    private List<String> extended;
}
