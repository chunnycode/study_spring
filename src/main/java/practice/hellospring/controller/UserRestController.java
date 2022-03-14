package practice.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practice.hellospring.model.User;
import practice.hellospring.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserServiceImpl userService;

    public UserRestController() {
    }

    @GetMapping("")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("/{userNo}")
    public User getUser(@PathVariable int userNo){
        return userService.getUser(userNo);
    }

    @PostMapping("")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @PutMapping("")
    public void modifyUser(@PathVariable int userNo, @RequestBody User user){
        userService.modifyUser(userNo, user);
    }

    @DeleteMapping("/{userNo}")
    public void removeUser(@PathVariable int userNo){
        userService.removeUser(userNo);
    }

}
