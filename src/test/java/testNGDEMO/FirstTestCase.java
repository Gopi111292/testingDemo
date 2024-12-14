package testNGDEMO;

import org.testng.annotations.Test;



//  -3 -2 -1 0 1 2 3 4 5
public class FirstTestCase {
	
	
	
	@Test(priority=1)
	public void login() {
		
		System.out.println("Login to application....");
	}
	
	@Test(priority=3)
	public void logout() {
		
		System.out.println("logout from application....");
	}
	
	
	@Test(priority=-1)
	public void openapp() {
		
		System.out.println("opening application....");
	}

}
