package com.luv2code.repository;

import com.luv2code.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
