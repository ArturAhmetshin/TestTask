package ru.ahmetshin.test.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ahmetshin.test.domain.Role;
import ru.ahmetshin.test.domain.User;
import ru.ahmetshin.test.repository.RoleRepository;
import ru.ahmetshin.test.service.UserService;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserService users;
    @Autowired
    private RoleRepository roles;

    @Test
    public void WhenGetUserThenReturnUserRoles() throws Exception {

        User user = this.users.getUserById(1L);


      }
    @Test
    public void WhenGetListUserThenReturnUserRoles() throws Exception {


        List<User> userList = this.users.listUsers();

    }

    @Test
    public void whenAddUserThenReturnUserRoles() throws Exception {
       Role role = new Role("user");

       this.users.addUser(
                new User("art1","art2","art3",
                        Collections.singletonList(role)));


    }
    @Test
    public void whenGetUserThenUpdateReturnUserRoles() throws Exception {
        User userUpdate = this.users.getUserById(58L);
       // userUpdate.setName("qwerty1");
        userUpdate.setRoles(Collections.singletonList(this.roles.findOne(1L)));
        this.users.updateUser(userUpdate);

    }




}
