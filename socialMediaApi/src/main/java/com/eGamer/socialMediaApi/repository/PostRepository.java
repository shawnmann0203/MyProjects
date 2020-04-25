package com.eGamer.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.eGamer.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
