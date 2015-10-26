package main.java.model;


import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Transient
    private String confirmPassword;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "email")
    private String email;
    @Column(name = "role")
    private String role;

    public User() {
        this.name = "";
        this.password = "";
        this.confirmPassword = "";
        this.nickname = "N/A";
        this.email = "N/A";
        this.role = Role.ROLE_USER;
    }

    @Override
    public String toString() {
        return "User: {" + name + ", " + nickname + ", " + email + ", " + password + "}";
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
