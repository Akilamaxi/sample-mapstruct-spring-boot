package com.example.dtoMapping.mapper;

import com.example.dtoMapping.model.domain.Customer;
import com.example.dtoMapping.model.dto.CustomerDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@Mapper(componentModel = "spring",uses = {AddressMapper.class})
public interface CustomerMapper extends EntityMapper<CustomerDTO, Customer> {


    @Mapping(source = "fullName",target = "name")
    @Mapping(target = "age",expression = "java(Integer.parseInt(dto.getAge()))")
    @Mapping(target = "customerId",expression = "java(dto.getCustomerId() !=null ? Long.parseLong(dto.getCustomerId()) : null)")
    Customer toEntity(CustomerDTO dto);



    @InheritInverseConfiguration
    CustomerDTO toDto(Customer entity);
}
