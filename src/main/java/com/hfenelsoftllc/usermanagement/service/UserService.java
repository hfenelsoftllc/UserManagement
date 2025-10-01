package com.hfenelsoftllc.usermanagement.service;

import com.hfenelsoftllc.usermanagement.dtos.UserDTO;
import com.hfenelsoftllc.usermanagement.entity.User;
import com.hfenelsoftllc.usermanagement.mapper.UserMapper;
import com.hfenelsoftllc.usermanagement.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDTO addUser(UserDTO userDTO) {
        User savedUser = userRepository.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);
    }
    public List<UserDTO> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> UserMapper.INSTANCE.mapUserToUserDTO(user)).collect(Collectors.toList());

    }



}
