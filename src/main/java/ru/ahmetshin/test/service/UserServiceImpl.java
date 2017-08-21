package ru.ahmetshin.test.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ahmetshin.test.DAO.UserDAO;
import ru.ahmetshin.test.domain.Roles;
import ru.ahmetshin.test.domain.Users;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<Users> listUsers() {
        return Lists.newArrayList(this.userDAO.listUsers());
    }

    @Override
    public Users getUserById(long id) {
        Users user = this.userDAO.getUserById(id);

        return new Users(user.getName(), user.getLogin(), user.getPassword(), user.getRoles().stream().map(
                r -> new Roles(r.getName())
        ).collect(Collectors.toList()));
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
