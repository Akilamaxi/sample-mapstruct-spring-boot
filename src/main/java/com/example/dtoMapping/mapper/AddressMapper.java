package com.example.dtoMapping.mapper;

import com.example.dtoMapping.model.domain.Address;
import com.example.dtoMapping.model.dto.AddressDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Akila Udara
 * @version 1.0
 * @since 2020-08-09
 */
@Mapper(componentModel = "spring",uses = {})
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {

    @Mapping(source = "city",target = "line3")
    @Mapping(target = "line1",expression = "java(dto.getLine1() !=null ? dto.getLine1().toString() : null)")
    Address toEntity(AddressDTO dto);


    @InheritInverseConfiguration
    AddressDTO toDto(Address entity);

}
