package main.java.model;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @NotBlank
    @Column(name = "name")
    private String name;
    @NotBlank
    @Column(name = "password")
    private String password;
    @Transient
    private String confirmPassword;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "email")
    private String email;
    @NotBlank
    @Column(name = "role")
    private String role;

    public User() {
        this.role = Role.ROLE_USER;
    }

    @Override
    public String toString() {
        return "User: {" + name + ", " + nickname + ", " + email + ", " + password + "}";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
