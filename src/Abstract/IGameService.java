package Abstract;

import Entites.Custemer;
import Entites.Game;

public interface IGameService {
	void add(Game game,Custemer customer);
	void update(Game game);
	void delete(Game game);
	void increase(Game game);

}
