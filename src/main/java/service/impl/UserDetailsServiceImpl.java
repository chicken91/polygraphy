package main.java.service.impl;


import com.google.common.collect.Lists;
import main.java.model.User;
import main.java.model.UserAuth;
import main.java.service.IUserDetailsService;
import main.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements IUserDetailsService {
    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByName(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not found: %s", username));
        }

        return createUserDetails(user);
    }

    public UserDetails createUserDetails(User user) {
        return new UserAuth(user.getName(), user.getPassword(), true, true, true, true, Lists.newArrayList(new SimpleGrantedAuthority(user.getRole())));
    }
}
