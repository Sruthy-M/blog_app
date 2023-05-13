package com.sruthy.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruthy.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
