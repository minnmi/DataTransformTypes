package com.example.dataobject.model.Mapper;

import com.example.dataobject.model.DTO.DoctorRequest;
import com.example.dataobject.model.DTO.DoctorResponse;
import com.example.dataobject.model.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DoctorMapper {

    /*
    We've defined a toDto() method in the interface, which accepts a
    Doctor instance and returns a DoctorDto instance.
    This is enough for MapStruct to know that we'd like to map a
    Doctor instance to a DoctorDto instance.

    When we build/compile the application,
    the MapStruct annotation processor plugin will pick up the DoctorMapper interface
    and generate an implementation for it:
     */

    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    DoctorDTO toDto(Doctor doctor);
}
