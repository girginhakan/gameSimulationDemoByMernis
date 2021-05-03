package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface GameService {
	void buy(User user,Campaign campaign,Game game);
}
