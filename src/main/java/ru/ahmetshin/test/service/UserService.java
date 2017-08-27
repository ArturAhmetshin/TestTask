package ru.ahmetshin.test.service;

import ru.ahmetshin.test.domain.User;

import java.util.List;

public interface UserService {
    public List<User> listUsers();
    public User getUserById(long id);
    public void removeUser(long id);
    public User addUser(User user);
    public User updateUser(User user);
}
