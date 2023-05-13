package com.sruthy.blog.services;

import com.sruthy.blog.payloads.UserDto;

import java.util.List;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
    List<UserDto> getallUsers();
    void deleteUser(Integer userId);
}
