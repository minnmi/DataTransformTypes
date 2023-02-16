package com.example.dataobject.service;

import com.example.dataobject.model.DTO.UserLocationDTO;
import com.example.dataobject.model.UserTest;
import com.example.dataobject.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserLocationDTO> getAllUsersLocation() {
        return ((List<UserTest>) userRepository
                .findAll())
                .stream()
                .map(this::convertToUserLocationDTO)
                .collect(Collectors.toList());
    }


//    private UserLocationDTO convertToUserLocationDTO(UserTest userTest) {
//        UserLocationDTO userLocationDTO = new UserLocationDTO();
//        userLocationDTO.setUserId(userTest.getId());
//        userLocationDTO.setUsername(userTest.getUsername());
//        Location location = userTest.getLocation();
//        userLocationDTO.setLat(location.getLat());
//        userLocationDTO.setLng(location.getLng());
//        userLocationDTO.setPlace(location.getPlace());
//        return userLocationDTO;
//    }

    /*
    Upon retrieving a list of Users, we directly convert them,
    alongside their Location information to UserLocationDTO objects.
    When calling this service, we'll retrieve this list of DTOs.
    */

    private UserLocationDTO convertToUserLocationDTO(UserTest userTest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        UserLocationDTO userLocationDTO = modelMapper.map(userTest, UserLocationDTO.class);
        return userLocationDTO;
    }

    /*
    Now, instead of the entire assignment process we've had to do before
    - we just map() a user to the UserLocationDTO.
    The method will flatten the properties of User within a UserLocationDTO
    and both the user information and the location will be present.

    Note: When working with objects as properties,
    like our Location is a property of User,
    the standard matcher of the library may not be able to match all the properties.
    We've set the matching strategy to LOOSE
    to make it easier for the library to locate and match properties.
     */



}
