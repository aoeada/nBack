package main.java.Repository.Interfaces;

import java.util.List;
import main.java.Classes.User;

public interface IUserRepository {
    List<User> getAllUsers();
    User getUserById(int userId);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    boolean loginExists(String username, String password);
    User getUserWithLogin(String username, String password);
}
