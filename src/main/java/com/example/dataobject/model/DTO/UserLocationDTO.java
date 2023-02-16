package com.example.dataobject.model.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 Let's make a Data Transfer Object to only transfer the required information.
 And while we're at it,
 let's aggregate the User and Location information,
 so that the data is transferred together:
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLocationDTO {
    private Long userId;
    private String username;
    private double lat;
    private double lng;
    private String place;

}
