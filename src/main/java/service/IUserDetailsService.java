package main.java.service;

import main.java.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface IUserDetailsService extends UserDetailsService {
    UserDetails createUserDetails(User user);
}
