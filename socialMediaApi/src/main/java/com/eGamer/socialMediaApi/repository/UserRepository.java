package com.eGamer.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.eGamer.socialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
}
