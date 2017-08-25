package ru.ahmetshin.test.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @GeneratedValue(strategy = GenerationType.AUTO)// autoincrement
    @Id
    private long id;
    private String name;
    private String login;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles", joinColumns = @JoinColumn(name = "user_id", nullable = false, updatable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false, updatable = false))
    private List<Roles> roles;

    public Users() {
    }

    public Users(String name, String login, String password, List<Roles> roles) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        return id == users.id;
    }

    @Override
    public int hashCode() {
        return (int) id ;
    }
}

