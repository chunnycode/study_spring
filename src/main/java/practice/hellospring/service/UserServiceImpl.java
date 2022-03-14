package practice.hellospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.hellospring.dao.UserDao;
import practice.hellospring.model.User;
import practice.hellospring.service.Interface.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(int userNo) {
        return userDao.getUser(userNo);
    }

    @Override
    public User registerUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public void modifyUser(int userNo, User user) {
        userDao.updateUser(userNo, user);
    }

    @Override
    public void removeUser(int userNo) {
        userDao.deleteUser(userNo);
    }
}
