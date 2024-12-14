package testNGDEMO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//*/
//1.Login
//2,Search
//3.Logout 
//4.Login 
//5.Advanced Search
//6.Logout
//*/

public class AnnotationsDemo1 {

	@BeforeClass
	public void login() {
		
		System.out.println("This is a login....");
	}
	
	
	 @Test(priority=1)
	public void search() {
		System.out.println("This is a search");
	}
	 @Test(priority=2)
	public void Advancesearch() {
		System.out.println("This is a Advancesearch");
	}
	 
	 
	 @AfterClass
		public void logout() {
			System.out.println("This is a logout");
		}
}
