package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void register(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanýcý kayýt iþlemi baþarýyla gerçekleþti.");
		}else{
			System.out.println("Girdiðiniz bilgilerde kullanýcý bulunamadý");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanýcý baþarýyla güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanýcý silindi.");
		
	}

}
