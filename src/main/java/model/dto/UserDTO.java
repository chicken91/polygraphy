package main.java.model.dto;


import main.java.model.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.Collection;
import java.util.List;

public class UserDTO {
    private Integer id;
    private String name;
    private String email;
    private String role;

    public static List<UserDTO> transformUsersToListDTO(Collection<User> users) {
        return new ModelMapper().map(users, new TypeToken<List<UserDTO>>() {
        }.getType());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
