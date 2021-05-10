package Core.concretes;

import Core.abstracts.InputVerificationService;
import Entities.concretes.User;
import GoogleUser.JGoogleUserIvalid;

public class JGoogleUserVerificationServiceAdepter implements InputVerificationService {

	@Override
	public boolean isValid(User user) {
		JGoogleUserIvalid googleValid=new JGoogleUserIvalid();
		return googleValid.isValid();
	}

}
