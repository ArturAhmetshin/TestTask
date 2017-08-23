package ru.ahmetshin.test.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ahmetshin.test.domain.Roles;
import ru.ahmetshin.test.domain.Users;
import ru.ahmetshin.test.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository users;

    @Autowired
    public UserServiceImpl(UserRepository users) {
        this.users = users;
    }

    @Override

    public List<Users> listUsers() {
        return Lists.newArrayList(this.users.findAll());
    }

    @Override
    public Users getUserById(long id) {
        Users user = this.users.findOne(id);
        return new Users(user.getName(), user.getLogin(), user.getPassword(), user.getRoles().stream().map(
                r -> new Roles(r.getName())).collect(Collectors.toList()));

    }

    @Override
    public void removeUser(long id) {
        this.users.delete(id);
    }

    @Override
    public Users addUser(Users user) {
        return this.users.save(user);
    }

    @Override
    public Users updateUser(Users user) {
        return this.users.save(user);
    }


}
