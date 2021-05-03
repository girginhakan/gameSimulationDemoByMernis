package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager implements GameService {

	@Override
	public void buy(User user, Campaign campaign, Game game) {
		if (campaign.getDiscountAmount() > 0) {
			System.out.println(user.getFirstName() + " adl� kullan�c� " + game.getGameName() + " adl� oyunu fiyat� "
					+ game.getUnitPrice() + " TL iken" + campaign.getCampaignName() + " kampanyas� sayesinde %"
					+ campaign.getDiscountAmount() + " indirim ile " + game.getUnitPriceAfterDiscount(campaign)
					+ "TL'ye sat�n al�m ger�ekle�mi�tir.");
		}else {
			System.out.println(user.getFirstName() + " adl� kullan�c� " + game.getGameName() + " adl� oyunu "
					+ game.getUnitPrice() + "TL ye sat�n al�m i�lemi ger�ekle�mi�tir.") ;
		}

	}

}
