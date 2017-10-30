package main.java.Repository;

import main.java.Repository.Interfaces.IUserRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.User;

@Transactional
@Repository
public class UserRepository implements IUserRepository{
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User as user ORDER BY user.Userid DESC";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public User getUserById(int userId) {
		return entityManager.find(User.class, userId);
	}
	
	@Override
	public void createUser(User user) {
		entityManager.persist(user);
	}
	
	@Override
	public void updateUser(User user) {
		User holderUser = getUserById(user.getUserId());
		holderUser.setFirstname(user.getFirstname());
		holderUser.setLastname(user.getLastname());
		entityManager.flush();
	}
	
	@Override
	public void deleteUser(int userId) {
		entityManager.remove(getUserById(userId));
	}
	
	@Override
	public boolean loginExists(String username, String password) {
		String hql = "FROM User as user WHERE user.username = ? and user.password = ?";
		int count = entityManager.createQuery(hql).setParameter(1, username)
		              .setParameter(2, password).getResultList().size();
		return count > 0 ? true : false;
	}
	
	@Override
	public User getUserWithLogin(String username, String password){
		String hql = "FROM User as user WHERE user.username = ? and user.password = ?";
		User user = (User) entityManager.createQuery(hql).setParameter(1, username)
						.setParameter(2, password).getResultList().get(0);
		return user;
	}
} 