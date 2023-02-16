package com.example.dataobject.model.DTO;

import com.example.dataobject.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private int year;

    /*
     A DTO class can have a constructor that instantiates
     itself using the provided Entity instance.
     Alternatively, an entity class can have a constructor
     that accepts a DTO instance as an argument.
     */
    public StudentDTO(Student entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.year = entity.getYear();
    }

    /*
    An entity or a DTO can transform into the other
    types by providing a conversion method.
     */

    public Student toEntity() {
        Student entity = new Student();

        entity.setId(this.id);
        entity.setFirstName(this.firstName);
        entity.setLastName(this.lastName);
        entity.setYear(this.year);
        return entity;
    }

}
