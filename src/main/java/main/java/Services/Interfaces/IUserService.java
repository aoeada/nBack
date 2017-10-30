package main.java.Services.Interfaces;

import java.util.List;
import main.java.Classes.User;

public interface IUserService {
	List<User> getAllUsers();
	User getUserById(int userId);
	boolean createUser(User user);
	void updateUser(User user);
	void deleteUser(int userId);
	boolean verifyLogin(String username, String password);
	User getUserWithLogin(String username, String password);
}
