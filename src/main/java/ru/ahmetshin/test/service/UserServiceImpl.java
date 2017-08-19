package ru.ahmetshin.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ahmetshin.test.DAO.UserDAO;
import ru.ahmetshin.test.domain.Users;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<Users> listUsers() {
        return this.userDAO.listUsers();
    }

    @Override
    public Users getUserById(long id) {
        return this.userDAO.getUserById(id);
    }

    @Override
    public void removeUser(long id) {
        this.userDAO.removeUser(id);
    }

    @Override
    public void addUser(Users user) {
        this.userDAO.addUser(user);
    }

    @Override
    public void updateUser(Users user) {
        this.userDAO.updateUser(user);
    }
}
