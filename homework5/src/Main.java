import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.concretes.EmailValidatorManager;
import Core.concretes.InputVerification;
import Core.concretes.JGoogleUserVerificationServiceAdepter;
import DataAccess.concretes.UserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {

        User user1= new User(1,"Melike","Aþýkoðlu","melikeaskolu@hotmail.com","123456");
        User user2= new User(2,"Nida","Hancý","nidahanci@hotmail.com","111111111111");
        User user3 = new User(3,"Engin","Demiroð","Demirogg12@hotmail.com","engin7894");

        UserService userService = new UserManager(new InputVerification(), new UserDao(), new EmailValidatorManager());
        userService.register(user1);

        System.out.println("----------------------------------");

        userService.register(user1);

        System.out.println("----------------------------------");

        userService.register(user2);

        System.out.println("----------------------------------");

        userService.register(user3);

        System.out.println("----------------------------------");



        UserService userService2 = new UserManager(new JGoogleUserVerificationServiceAdepter(), new UserDao(), new EmailValidatorManager());
        userService2.register(user2);



        System.out.println("----------------------------------");

        userService.login("nidahanci@hotmail.com","111111111111"); // doðru girdiler

        System.out.println("----------------------------------");

        userService.login ("engindemiroð@gmail.com", "56565655225215448"); // yanlýþ parola




    }

}
