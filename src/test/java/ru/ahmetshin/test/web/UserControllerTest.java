package ru.ahmetshin.test.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ahmetshin.test.domain.Users;
import ru.ahmetshin.test.repository.RoleRepository;
import ru.ahmetshin.test.service.UserService;

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

        Users user = this.users.getUserById(1L);


        ObjectMapper mapper = new ObjectMapper();
        assertThat(
                mapper.writeValueAsString(
                        user

                ),
                is("{\"id\":0,\"name\":\"vasa\",\"login\":\"vasa\",\"password\":\"vvv\",\"roles\":[{\"id\":0,\"name\":\"admin\",\"users\":null},{\"id\":0,\"name\":\"oper\",\"users\":null}]}")
        );

    }



}
