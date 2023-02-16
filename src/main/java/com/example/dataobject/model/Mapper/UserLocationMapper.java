package com.example.dataobject.model.Mapper;

import com.example.dataobject.model.DTO.UserLocationDTO;
import com.example.dataobject.model.UserTest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserLocationMapper {
    UserLocationMapper INSTANCE = Mappers.getMapper(UserLocationMapper.class);

    @Mapping(source = "id", target = "userId")
    UserLocationDTO toDto(UserTest userTest);
}
