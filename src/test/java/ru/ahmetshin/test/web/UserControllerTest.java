package ru.ahmetshin.test.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ahmetshin.test.DAO.RoleDAO;
import ru.ahmetshin.test.domain.Users;
import ru.ahmetshin.test.service.UserService;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserService users;
    @Autowired
    private RoleDAO roles;

    @Test
    public void WhenGetUserThenReturnUserRoles() throws Exception {
       // Roles role = this.roles.getRoleById(1L);
        Users user = this.users.getUserById(1L);
      //  this.users.addUser(new Users("art1", "art2", "art3",
        //        Collections.singletonList(role)));

        ObjectMapper mapper = new ObjectMapper();
        assertThat (
                mapper.writeValueAsString(
                        this.users.getUserById(user.getId())
                ),
                is("{\"id\":1,\"name\":\"vasa\",\"login\":\"vasa\",\"password\":\"vvv\"\"roles\":[{\"id\":0,\"name\":\"admin\",\"users\":null}]}")
        );

    }
}
