package gameSimulationDemoByMernis;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager =new UserManager(new MernisServiceAdapter());
		
		User user1= new User(1, "HAKAN", "GÝRGÝN", "1234567890", new Date(1992,6,23));
		
		
		userManager.register(user1);
		
		
		Campaign campaign1 =new Campaign(1,"Merve Kampanyasý", 20);
		Campaign campaign2 =new Campaign(1,"Merve Kampanyasý", 0);
		
		CampaignManager campaignManager =new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		
		Game game1=new Game(1, "PlayMerve", 100);
		
		GameManager gameManager =new GameManager();
		gameManager.buy(user1, campaign1, game1);
		gameManager.buy(user1, campaign2, game1);

	}

}
