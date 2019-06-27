package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.domain.user.User;

public interface UserRepository extends JpaRepository<User, String>{
}
