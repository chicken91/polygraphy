package main.java.model;


import com.google.common.base.Objects;
import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
    public static final String ROLE_GOD = "ROLE_GOD";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";

    public static final Role GOD = new Role(ROLE_GOD);
    public static final Role USER = new Role(ROLE_USER);
    public static final Role ADMIN = new Role(ROLE_ADMIN);

    private String authority;

    public Role(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equal(authority, role.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(authority);
    }
}
