package Concrete;

import Abstract.ICampaignService;
import Abstract.ISaleService;
import Entites.Campaign;
import Entites.Custemer;
import Entites.Game;

public class SaleManager implements ISaleService {
	CustemerManager custemerManager;
	GameManeger gameManeger;
	
     public SaleManager(CustemerManager custemerManager,GameManeger gameManeger) {
    	this.custemerManager=custemerManager;
    	this.gameManeger=gameManeger;
		
	}

	@Override
	public void sale(Game game, Custemer custemer) {
		if(custemer.getMoney()>=game.getPrice()) {
			System.out.println("Degerli Musterimiz"+custemer.getFirstName()+"Oyunu satin aldýnýz:"+game.get_gamename());
			custemerManager.renewAmount(custemer, game.getPrice());
			gameManeger.increase(game);
			
		}else {
			System.out.println("Oyun icin butceniz yetersizdir:"+game.get_gamename());
		}
		
	}

	

	@Override
	public void sale(Game game, Custemer customer, Campaign campaign) {
		// TODO Auto-generated method stub
Double campaignPrice = game.getPrice() - ( game.getPrice() * campaign.getDiscount() / 100 ) ;
		
		if( customer.getMoney() >= campaignPrice ) {
			
			System.out.println("Degerli Musterimiz "+customer.getFirstName()+" , "+game.get_gamename()+"Oyunun indirimi: "+ campaign.getUnitPriceAfterDiscount());
			System.out.println("Kalan para:"+(customer.getMoney()-campaign.getUnitPriceAfterDiscount()));
			
			custemerManager.renewAmount(customer, campaignPrice );
			gameManeger.increase(game);
			
		}
		else {
			System.out.println("Oyun icin butceniz yetersizdir: "+ game.get_gamename());
	}
		

	}

		
}



