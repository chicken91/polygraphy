package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    @Transient
    private String confirmPassword;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    public User() {
        this.username = "N/A";
        this.password = "";
        this.confirmPassword = "";
        this.nickname = "N/A";
        this.email = "N/A";
    }
}
