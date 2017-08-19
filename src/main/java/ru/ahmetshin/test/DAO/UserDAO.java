package ru.ahmetshin.test.DAO;

import ru.ahmetshin.test.domain.Users;

import java.util.List;

public interface UserDAO {
    public List<Users> listUsers();
    public Users getUserById(long id);
    public void removeUser(long id);
    public void addUser(Users user);
    public void updateUser(Users user);


}
