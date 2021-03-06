package teamseer_core_api;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.description.FieldDesc;
import org.apache.axis.utils.BeanPropertyDescriptor;

import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;


@WebService 
public class TimeMangerConnection {
	
	public static final String teamSeerWSDLloc = "https://www.teamseer.com/services/soap/coreapi/1_0_0/teamseer_core_api.wsdl";
	
	public static final String teamSeerVersion = "1_0_0";
	
	private static int teamSeerCompanyId = 0;
	
	private static String teamSeerKey = "";
	
	public static void main(String[] args) {
		
		try {
			
			Teamseer_core_apiServiceLocator service = new Teamseer_core_apiServiceLocator();
			service.setMaintainSession(true);
			boolean isMaintained = service.getMaintainSession();
			System.out.println( "Session Maintained: " + isMaintained );
			
			
			Teamseer_core_apiBindingStub bindingStub = new Teamseer_core_apiBindingStub(new URL(service.getteamseer_core_apiPortAddress()), service);
			boolean isAuthenticated = bindingStub.authenticate(teamSeerCompanyId, teamSeerKey, teamSeerVersion);
			
			System.out.println( "Authenticated: " + isAuthenticated );
			
			if (isAuthenticated) {
				String[] users = bindingStub.getActiveUsers();
				System.out.println( "List of users: " + Arrays.toString(users) );
				System.out.println( users.length );
				
				System.out.println(bindingStub.setDateFormat("yyyy-mm-dd"));
				
				for (String user : users) {
					DayActivityAPI[] dayArray = bindingStub.getRecordsFor( user, "2015-08-20", "2015-08-27");
					if ( dayArray.length != 0  && user.contains("wzy")   ) {
						System.out.println(Arrays.toString(dayArray));
						
						for (int i = 0; i < dayArray.length; i++) {
							
							System.out.println();
							System.out.println(" ------------------ ");
							System.out.println("User Identifier: " + dayArray[i].getUserIdentifier());
							System.out.println("Date Of Holiday: " + dayArray[i].getDate() );
							System.out.println("Has Notes: " + dayArray[i].isHasNotes() );
							System.out.println("Needs Approval: " + dayArray[i].isNeedsApproval() );
							System.out.println("CategoryArr: " + dayArray[i].getCategoryArr());
							System.out.println("Status String: " + dayArray[i].getStatusStr());
							System.out.println("TypeString: " + dayArray[i].getTypeStr());
							System.out.println(" ------------------ ");
							
						}
						
						
						
					} else {
						//System.out.println("No records");
					}
					
					
					
				}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end of main
	
	
	public void doStuff(){
		//TODO: stuff
	}

}
