package practice.hellospring.service.Interface;

import practice.hellospring.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();
    User getUser(int userNo);
    User registerUser(User user);
    void modifyUser(int userNo, User user);
    void removeUser(int userNo);
}
