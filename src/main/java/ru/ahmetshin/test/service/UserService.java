package ru.ahmetshin.test.service;

import ru.ahmetshin.test.domain.Users;

import java.util.List;

public interface UserService {
    public List<Users> listUsers();
    public Users getUserById(long id);
    public void removeUser(long id);
    public void addUser(Users user);
    public void updateUser(Users user);
}
