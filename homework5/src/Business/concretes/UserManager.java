package Business.concretes;

import Business.abstracts.UserService;
import Core.abstracts.InputVerificationService;
import Core.abstracts.ValidatorService;
import DataAccess.abstracts.UserDaoService;
import Entities.concretes.User;

public class UserManager implements UserService {
	InputVerificationService memberInformationValidation;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(InputVerificationService memberInformationValidation, UserDaoService userDaoService,
			ValidatorService validatorService) {
		super();
		this.memberInformationValidation = memberInformationValidation;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!memberInformationValidation.isValid(user) ) {
			System.out.println("Kullanýcý bilgileri yanlýþ formatta kayýt iþlem baþarýsýz..");
		}else if(!userDaoService.emailCheck(user)) {
			System.out.println("Bu email adresi daha önce alýnmýþ = "+user.getEmail()+"n"+"Kayýt iþlemi baþarýsýz..");
		}else{
			userDaoService.add(user);
			validatorService.sendVarificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		if (userDaoService.loginByCheck(email, password)) {
			System.out.println("Giriþ baþarýlý");
			
		}else {
			System.out.println("Kullanýcý adý yanlýþ");
		}
		
	}

}
