package Concrete;

import Abstract.ICustomerChecksService;
import Abstract.IGameService;
import Entites.Custemer;
import Entites.Game;

public class GameManeger implements IGameService {
	
   ICustomerChecksService customerChecksService;
	
	
	public GameManeger( ICustomerChecksService customerChecksService) {
		
		this.customerChecksService=customerChecksService;
		
	}

	@Override
	public void add(Game game,Custemer customer) {
		// TODO Auto-generated method stub
	 if(customerChecksService.checkIfRealPerson(customer)) {
		 System.out.println("Sayýn"+customer.getFirstName()+""+customer.getLastName());
			System.out.println("Oyun basariyla eklenmistir:"+game.get_gamename());
			System.out.println("Oyun fiyati:"+game.getPrice());
	 }else {
		 System.out.println("Kimlik bilgilerinizi kontrol ediniz");
	 }
			
		}
		
		
	

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun fiyati  Güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun silindi"+game.get_gamename());
		
	}

	@Override
	public void increase(Game game) {
		// TODO Auto-generated method stub
		int newStar = game.getStar();
		newStar ++ ;
		
		game.setStar(newStar);
		
		System.out.println("Tebrikler !! Dikkatler " + game.get_gamename()+" isimli oyunda!");
		
	}

}
