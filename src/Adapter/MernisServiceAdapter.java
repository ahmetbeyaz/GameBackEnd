package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerChecksService;
import Entites.Custemer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerChecksService {

	@Override
	public boolean checkIfRealPerson(Custemer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoap soapClient=new KPSPublicSoapProxy();
		 boolean result = false;
		 try {
			result=soapClient.TCKimlikNoDogrula((customer.getNationalityId()),customer.getFirstName().toUpperCase()
						,customer.getLastName().toUpperCase() , customer.getDateofBirthDate().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
	}

}
