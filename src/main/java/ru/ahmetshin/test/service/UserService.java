package ru.ahmetshin.test.service;

import ru.ahmetshin.test.domain.Users;

import java.util.List;

public interface UserService {
    public List<Users> listUsers();
    public Users getUserById(long id);
    public void removeUser(long id);
    public Users addUser(Users user);
    public Users updateUser(Users user);
}
