package Core.concretes;

import Core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVarificationMail() {
		System.out.println("Doðrulama maili gönderildi. Lütfen Mail adresinizi kontrol ediniz.");
		
	}

}
