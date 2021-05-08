package homework3;

import mernis.KPSPublicSoap;
import mernis.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBird());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
	

}
