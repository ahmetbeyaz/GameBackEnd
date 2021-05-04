package Concrete;

import Abstract.ICustemerService;
import Abstract.ICustomerChecksService;
import Entites.Custemer;

public class CustemerManager implements ICustemerService {
	ICustomerChecksService custemercheckService;
	


	public CustemerManager(ICustomerChecksService custemercheckService) {
		this.custemercheckService = custemercheckService;
	}

	@Override
	public void add(Custemer custemer) {
		
  if(custemercheckService.checkIfRealPerson(custemer)) {
	  System.out.println(custemer.getFirstName()+""+custemer.getLastName()+"Adli oyunucumuz aramiza hosgeldiniz");
	  System.out.println("Butceniz:"+custemer.getMoney());
  }else {
	  System.out.println("Lutfen kimlik bilgileriniz kontrol ediniz");
  }
		
		
	}

	@Override
	public void update(Custemer custemer) {
		// TODO Auto-generated method stub
		System.out.println("Kullanici  güncelllendi"+custemer.getFirstName());
		
	}

	@Override
	public void delete(Custemer custemer) {
		// TODO Auto-generated method stub
		System.out.println("Kullanici silindi"+custemer.getFirstName());
		
	}

	@Override
	public void renewAmount(Custemer custemer, Double amount) {
		// TODO Auto-generated method stub
		Double oldAmount=custemer.getMoney();
		Double newAmount=oldAmount-amount;
		custemer.setMoney(newAmount);
		System.out.println("Sistemdeki paraniz güncellenmiþtir");
		
	}

}
