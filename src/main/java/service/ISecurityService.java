package main.java.service;


import org.springframework.security.core.userdetails.UserDetails;

public interface ISecurityService {
    void reAuthentication(UserDetails details);
}
