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
    @ManyToMany(mappedBy = "roles")
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
}
