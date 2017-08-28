package ru.ahmetshin.test.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ahmetshin.test.domain.User;
import ru.ahmetshin.test.repository.RoleRepository;
import ru.ahmetshin.test.service.UserService;

import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserService users;
    @Autowired
    private RoleRepository roles;

    @Test
    public void WhenGetUserThenReturnUserRoles() throws Exception {

        User user = this.users.getUserById(2L);

        ObjectMapper mapper = new ObjectMapper();
        assertThat(
                mapper.writeValueAsString(
                        user

                ),
                is("{\"id\":2,\"name\":\"rer\",\"login\":\"rfe\",\"password\":\"ewrwer\",\"roles\":[]}")
        );


    }

    @Test
    public void whenGetUserThenUpdateReturnUserRoles() throws Exception {
        User userUpdate = this.users.getUserById(1L);
        userUpdate.setName("vas1");
        userUpdate.setRoles(Collections.singletonList(this.roles.findOne(1L)));
        this.users.updateUser(userUpdate);

        ObjectMapper mapper = new ObjectMapper();
        assertThat(
                mapper.writeValueAsString(
                        userUpdate

                ),
                is("{\"id\":1,\"name\":\"vas1\",\"login\":\"vas\",\"password\":\"123\",\"roles\":[{\"id\":1,\"name\":\"admin\"}]}")
        );

    }


}
