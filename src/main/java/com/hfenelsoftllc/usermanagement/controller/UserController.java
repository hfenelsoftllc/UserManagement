package com.hfenelsoftllc.usermanagement.controller;

import com.hfenelsoftllc.usermanagement.dtos.UserDTO;
import com.hfenelsoftllc.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/fetchAllUsers")
    public ResponseEntity<List<UserDTO>> fetchAllUsers() {
        List<UserDTO> allUsers = userService.findAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PostMapping("/addUsers")
    public ResponseEntity<UserDTO> addUsers(@RequestBody UserDTO userDTO) {
        UserDTO newUser = userService.addUser(userDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
