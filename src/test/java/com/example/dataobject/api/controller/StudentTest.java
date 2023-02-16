package com.example.dataobject.api.controller;

import com.example.dataobject.model.DTO.StudentDTO;
import com.example.dataobject.model.Mapper.StudentMapper;
import com.example.dataobject.model.Student;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testToEntity() {
        StudentDTO dto = new StudentDTO(1L, "Jon", "Snow", 2450);

        StudentMapper mapper = new StudentMapper();
        Student entity = mapper.toEntity(dto);

        assertEquals(entity.getId(), dto.getId());
        assertEquals(entity.getFirstName(), dto.getFirstName());
        assertEquals(entity.getLastName(), dto.getLastName());
        assertEquals(entity.getYear(), dto.getYear());
    }

    @Test
    public void testToDto() {
        Student entity = new Student(1L, "Jon", "Snow", 2450);

        StudentMapper mapper = new StudentMapper();
        StudentDTO dto = mapper.toDto(entity);

        assertEquals(dto.getId(), entity.getId());
        assertEquals(dto.getFirstName(), entity.getFirstName());
        assertEquals(dto.getLastName(), entity.getLastName());
        assertEquals(dto.getYear(), entity.getYear());
    }



}
