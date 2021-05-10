package Core.abstracts;

import Entities.concretes.User;

public interface InputVerificationService {
	boolean isValid(User user);
	

}
