package com.java.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.java.restservice.entity.User;

@RepositoryRestResource(path = "/movies")

public interface UserRepository extends JpaRepository<User, String> {

}