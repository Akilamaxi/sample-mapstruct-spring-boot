package com.example.dtoMapping.model.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@Data
@ToString
public class Address {
    private String line1;
    private String line2;
    private String line3;
}
