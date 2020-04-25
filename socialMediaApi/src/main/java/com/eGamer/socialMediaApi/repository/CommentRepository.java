package com.eGamer.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.eGamer.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
