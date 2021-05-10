package DataAccess.abstracts;

import Entities.concretes.User;

public interface UserDaoService {
	void add(User user);
	boolean emailCheck(User user);
	boolean loginByCheck(String email, String password);
	
	

}
