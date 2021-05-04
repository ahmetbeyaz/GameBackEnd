package Abstract;

import Entites.Campaign;
import Entites.Custemer;

public interface ICampaignService {
	void campaignadd(Campaign campaign,Custemer custemer);
	void update(Campaign campaign);
	void delete(Campaign campaign);

}
