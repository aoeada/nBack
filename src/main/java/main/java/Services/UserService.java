package main.java.Services;

import main.java.Services.Interfaces.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.java.Repository.Interfaces.IUserRepository;
import main.java.Classes.User;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public List<User> getAllUsers(){
		return userRepository.getAllUsers();
	}
	
	@Override
	public User getUserById(int userId) {
		User obj = userRepository.getUserById(userId);
		return obj;
	}
		
	@Override
	public synchronized boolean createUser(User user){
		if (userRepository.loginExists(user.getUsername(), user.getPassword())) {
			return false;
		} else {
			userRepository.createUser(user);
			return true;
		}
	}
	
	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}
	
	@Override
	public void deleteUser(int userId) {
		userRepository.deleteUser(userId);
	}
	
	@Override
	public boolean verifyLogin(String username, String password){
		return userRepository.loginExists(username, password);
	}
	
	@Override
	public User getUserWithLogin(String username, String password){
		return userRepository.getUserWithLogin(username, password);
	}

}
