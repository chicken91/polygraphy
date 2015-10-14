package main.java.service;


import com.google.common.collect.Lists;
import main.java.model.User;
import main.java.model.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not found: %s", username));
        }

        return new UserAuth(user.getUsername(), user.getPassword(), true, true, true, true, Lists.newArrayList(new SimpleGrantedAuthority(user.getRole())));
    }
}
