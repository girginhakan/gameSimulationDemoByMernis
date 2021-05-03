package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		final KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalIdentity()), user.getFirstName(),
					user.getLastName(), user.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}

		return result;
		
	}

}
