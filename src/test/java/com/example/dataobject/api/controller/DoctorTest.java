package com.example.dataobject.api.controller;

import com.example.dataobject.model.DTO.DoctorDTO;
import com.example.dataobject.model.Doctor;
import com.example.dataobject.model.Mapper.DoctorMapper;
import org.junit.Assert;
import org.junit.Test;


public class DoctorTest {

    @Test
    public void testMapStruct() {
        Doctor doctor = new Doctor();
        DoctorDTO doctorDTO = DoctorMapper.INSTANCE.toDto(doctor);
        Assert.assertEquals("Os ids devem ser iguais", doctor.getId(), doctor.getName());
    }
}
