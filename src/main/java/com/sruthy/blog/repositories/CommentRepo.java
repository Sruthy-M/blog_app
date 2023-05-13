package com.sruthy.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruthy.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}