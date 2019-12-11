package service;

import dao.UserDao;
import entity.User;

import java.util.List;

public class UserService {
    private static UserService userService;
    private UserDao userDao;

    public static UserService getUserService(){
        if(userService == null){
            userService = new UserService();
        }
        return userService;
    }
    private UserService() {
        userDao = new UserDao();
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public User getUserById(int id) {
        return userDao.findById(id);
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public void updateUser(User user) {
        userDao.update(user);

    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public boolean deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}

