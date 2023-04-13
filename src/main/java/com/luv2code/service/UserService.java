package com.luv2code.service;

import com.luv2code.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(User user);
}
