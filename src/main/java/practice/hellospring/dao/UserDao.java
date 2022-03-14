package practice.hellospring.dao;

import org.springframework.stereotype.Repository;
import practice.hellospring.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    public static List<User> users;

    static{
        users = new ArrayList<>();
        users.add(new User(1, "April"));
        users.add(new User(2, "Spencer"));
        users.add(new User(3, "Derik"));
        users.add(new User(4, "Cinnamon"));
        users.add(new User(5, "Rose"));
    }

    public List<User> getAllUsers(){
        return users;
    }

    public User getUser(int userNo){
        return users.stream().filter(user -> user.getUserNo()==userNo).findFirst().orElse(new User(-1, ""));
    }

    public User insertUser(User user){
        users.add(user);
        return user;
    }

    public void updateUser(int userNo, User user){
        users.stream()
                .filter(u -> u.getUserNo()==userNo)
                .findFirst()
                .orElse(new User(-1, ""))
                .setUserName(user.getUserName());
    }

    public void deleteUser(int userNo){
        users.removeIf(user -> user.getUserNo() == userNo);
    }

}
