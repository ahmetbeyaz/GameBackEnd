package Concrete;

import Abstract.ICampaignService;
import Abstract.ICustomerChecksService;
import Entites.Campaign;
import Entites.Custemer;

public class CampaignManager implements ICampaignService {


	@Override
	public void campaignadd(Campaign campaign,Custemer customer) {
	
			System.out.println("Kampanyamýz eklendi: "+campaign.getDiscount());
		}
	
		

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Yeni kampanya fiyatimiz:"+campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanyamiz silindi"+campaign.getDiscount());
		
	}

}
