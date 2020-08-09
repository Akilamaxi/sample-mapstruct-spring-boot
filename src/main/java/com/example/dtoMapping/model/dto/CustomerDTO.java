package com.example.dtoMapping.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@Data
@ToString
public class CustomerDTO {
    private String fullName;
    private String age;
    private String customerId;
    private AddressDTO address;
}
