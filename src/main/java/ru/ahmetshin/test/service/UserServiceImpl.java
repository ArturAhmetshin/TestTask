package ru.ahmetshin.test.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ahmetshin.test.domain.User;
import ru.ahmetshin.test.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository users;

    @Autowired
    public UserServiceImpl(UserRepository users) {
        this.users = users;
    }

    @Override

    public List<User> listUsers() {
        return Lists.newArrayList(this.users.findAll());
    }

    @Override
    public User getUserById(long id) {
        User user = this.users.findOne(id);
        return user;

    }

    @Override
    public void removeUser(long id) {
        this.users.delete(id);
    }

    @Override
    @Transactional
    public User addUser(User user) {
        return this.users.save(user);
    }

    @Override
    public User updateUser(User user) {
        return this.users.save(user);
    }


}
