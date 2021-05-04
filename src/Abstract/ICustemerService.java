package Abstract;

import Entites.Custemer;

public interface ICustemerService {
	void add(Custemer custemer);
	void update(Custemer custemer);
	void delete(Custemer custemer);
	void renewAmount(Custemer custemer , Double amount);

}
