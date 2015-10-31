package main.java.service.impl;

import main.java.service.ISecurityService;
import main.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service("SecurityService")
public class SecurityService implements ISecurityService {
    @Autowired
    IUserService userService;

    @Override
    public void reAuthentication(UserDetails details) {
        SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(details, null, details.getAuthorities()));
    }
}
