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
public class AddressDTO {
    private Integer line1;
    private String line2;
    private String city;
}
