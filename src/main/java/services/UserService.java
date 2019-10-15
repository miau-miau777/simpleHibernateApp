package services;

import dao.UserDAOImpl;
import models.Auto;
import models.User;

import java.util.List;

public class UserService {
    private UserDAOImpl userDAO = new UserDAOImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return userDAO.findById(id);

    }
    public void saveUser(User user) {
        userDAO.save(user);

    }
    public void updateUser(User user) {
        userDAO.update(user);

    }
    public void deleteUser(User user) {
        userDAO.delete(user);

    }
    public Auto findAuto(int id) {
        return userDAO.findAutoById(id);
    }
    public List<User> findAllUsers() {
        return userDAO.findAll();
    }


}
