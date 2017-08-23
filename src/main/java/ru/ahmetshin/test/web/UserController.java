package ru.ahmetshin.test.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ahmetshin.test.domain.Users;
import ru.ahmetshin.test.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<Users> listUsers() {
        return this.userService.listUsers();
    }

    @GetMapping("/get/{id}")
    public Users getUserById(@PathVariable long id) {
        return this.userService.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void removeUser(@PathVariable long id) {
        this.userService.removeUser(id);
    }

    @PostMapping("/add")
    public Users addUser(@RequestBody Users user) {
        return this.userService.addUser(user);
    }

   @PutMapping ("/edit")
  public Users updateUser(@RequestBody Users user) {
       return this.userService.updateUser(user);}



}
