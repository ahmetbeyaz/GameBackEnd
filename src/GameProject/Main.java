package GameProject;
import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustemerManager;
import Concrete.GameManeger;
import Concrete.SaleManager;
import Entites.Campaign;
import Entites.Custemer;
import Entites.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Custemer custemer=new Custemer();
     custemer.setId(1);
     custemer.setFirstName("Ahmet");
     custemer.setLastName("Beyaz");
     custemer.setDateofBirthDate(LocalDate.of(198,10, 01));
     custemer.setNationalityId(12L);
     custemer.setMoney(90);
     System.out.println("Butceniz:"+custemer.getMoney());
   //****************************************************************************************************************
  	Game game=new Game();
 	game.set_gamename("Valorant");
 	game.setPrice(80);
 //************************************************************************************************
 	
 	GameManeger gameManeger=new GameManeger(new MernisServiceAdapter());
 	gameManeger.add(game,custemer);
 	gameManeger.update(game);;
 	//*****************************************************
 	Campaign campaign=new Campaign();
 	campaign.setCampaignname("Trendyol Mila");
 	campaign.setDiscount(40);
 	campaign.setUnitPrice(70);
 	 System.out.println("Ýndirim:"+campaign.getUnitPriceAfterDiscount());
 	//****************************************
 	
 	CampaignManager campaignManager=new CampaignManager();
 	campaignManager.campaignadd(campaign,custemer);
 	//*******************************************************
     CustemerManager custemerManager=new CustemerManager(new MernisServiceAdapter());
     custemerManager.add(custemer);
     //*********************************************
 	SaleManager saleManager=new SaleManager(custemerManager, gameManeger);
 	saleManager.sale(game, custemer, campaign);
 	
     
    
     
	}

}
