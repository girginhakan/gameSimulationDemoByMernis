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
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullan�c� kay�t i�lemi ba�ar�yla ger�ekle�ti.");
		}else{
			System.out.println("Girdi�iniz bilgilerde kullan�c� bulunamad�");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullan�c� ba�ar�yla g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullan�c� silindi.");
		
	}

}
