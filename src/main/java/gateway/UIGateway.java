package gateway;

import com.gojob.business.dummy.DummyProfileBean;
import com.gojob.business.dummy.DummyProfileController;
import com.gojob.common.init.InitialiseHelper;
import com.gojob.framework.persistence.exception.PersistenceException;

/*
 * The purpose of this is class is to simulate the UI...This will be removed once we move to UI layer
 */
public class UIGateway
{
	public static void start()
	{
		InitialiseHelper.initialise();
		
	}
	
	public static void saveUserProfile()
	{
		DummyProfileBean dummyProfileBean = gotFromUI();
		DummyProfileController dpc = new DummyProfileController(dummyProfileBean);
		try
		{
			dpc.saveUserProfile();
		}
		catch (PersistenceException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static DummyProfileBean gotFromUI()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
