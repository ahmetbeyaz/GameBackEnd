package Abstract;

import Concrete.GameManeger;
import Entites.Campaign;
import Entites.Custemer;
import Entites.Game;

public interface ISaleService {
	void sale(Game game,Custemer custemer);
	void sale(Game game,Custemer customer,Campaign campaign);

}
