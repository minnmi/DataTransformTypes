package com.example.dataobject.model.Mapper;

import com.example.dataobject.model.DTO.StudentDTO;
import com.example.dataobject.model.Student;

public class StudentMapper {

    /*
    To keep both Entity and DTO classes independent and detached,
    we can create a dedicated converter class that handles the mapping
    between the Entity and the DTO fields.
     */

    public StudentDTO toDto(Student entity) {
        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setYear(entity.getYear());

        return dto;
    }

    public Student toEntity(StudentDTO dto) {
        Student entity = new Student();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setYear(dto.getYear());

        return entity;
    }



}
