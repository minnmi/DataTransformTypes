package com.example.dataobject.controller;

import com.example.dataobject.model.DTO.UserLocationDTO;
import com.example.dataobject.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapController {

    @Autowired
    private MapService mapService;

    /*
    This endpoint just returns a @ResponseBody.
    It can either be called by a user or by another service which parses the results.
     */

    @GetMapping("/map")
    @ResponseBody
    public List<UserLocationDTO> getAllUsersLocation() {
        List <UserLocationDTO> usersLocation = mapService.getAllUsersLocation();
        return usersLocation;
    }
}
