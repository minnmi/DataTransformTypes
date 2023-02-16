package com.example.dataobject.api.controller;

import com.example.dataobject.model.DTO.StudentDTO;
import com.example.dataobject.model.Student;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentModelMapperTest {

    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void testModelMapperToEntity() {
        StudentDTO dto = new StudentDTO(1L, "Jon", "Snow", 2450);

        /*
        convert a DTO to Entity
         */
        Student entity = modelMapper.map(dto, Student.class);

        assertEquals(entity.getId(), dto.getId());
        assertEquals(entity.getFirstName(), dto.getFirstName());
        assertEquals(entity.getLastName(), dto.getLastName());
        assertEquals(entity.getYear(), dto.getYear());
    }

    @Test
    public void testModelMapperToDto() {
        Student entity = new Student(1L, "Jon", "Snow", 2450);

        /*
        convert an Entity to DTO
         */
        StudentDTO dto = modelMapper.map(entity, StudentDTO.class);

        assertEquals(dto.getId(), entity.getId());
        assertEquals(dto.getFirstName(), entity.getFirstName());
        assertEquals(dto.getLastName(), entity.getLastName());
        assertEquals(dto.getYear(), entity.getYear());
    }
}
