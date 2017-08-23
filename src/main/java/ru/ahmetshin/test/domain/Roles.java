package ru.ahmetshin.test.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Roles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)// autoincrement
    @Id
    private long id;
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (name = "user_roles", joinColumns = @JoinColumn(name = "role_id", nullable = false, updatable = false),
    inverseJoinColumns = @JoinColumn(name = "user_id", nullable = false, updatable = false))
    private List<Users> users;

    public Roles() {
    }

    public Roles(String name) {
        this.name = name;
         }

    public Long getId() {
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

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Roles roles = (Roles) o;

        return id == roles.id;
    }

    @Override
    public int hashCode() {
        return (int) id;
    }
}
