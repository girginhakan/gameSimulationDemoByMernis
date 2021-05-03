package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager implements GameService {

	@Override
	public void buy(User user, Campaign campaign, Game game) {
		if (campaign.getDiscountAmount() > 0) {
			System.out.println(user.getFirstName() + " adlý kullanýcý " + game.getGameName() + " adlý oyunu fiyatý "
					+ game.getUnitPrice() + " TL iken" + campaign.getCampaignName() + " kampanyasý sayesinde %"
					+ campaign.getDiscountAmount() + " indirim ile " + game.getUnitPriceAfterDiscount(campaign)
					+ "TL'ye satýn alým gerçekleþmiþtir.");
		}else {
			System.out.println(user.getFirstName() + " adlý kullanýcý " + game.getGameName() + " adlý oyunu "
					+ game.getUnitPrice() + "TL ye satýn alým iþlemi gerçekleþmiþtir.") ;
		}

	}

}
