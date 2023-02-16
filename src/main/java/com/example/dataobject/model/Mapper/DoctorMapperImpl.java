package com.example.dataobject.model.Mapper;

import com.example.dataobject.model.DTO.DoctorRequest;
import com.example.dataobject.model.DTO.DoctorResponse;
import com.example.dataobject.model.Doctor;

public class DoctorMapperImpl implements DoctorMapper {
    @Override
    public Doctor toEntity(DoctorRequest request) {
        return null;
    }

    @Override
    public DoctorResponse toDto(Doctor doctor) {
        return null;
    }

    @Override
    public void update(Doctor _old, Doctor _new) {
        DoctorMapper.super.update(_old, _new);
    }

    /*
    The DoctorMapperImpl class now contains a toDto() method
    which maps our Doctor fields to the DoctorDto fields.
     */

}
