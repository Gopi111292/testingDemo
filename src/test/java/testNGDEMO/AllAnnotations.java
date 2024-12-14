package testNGDEMO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	public void bs() {
		System.out.println("This is a beforeSuite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("This is a AfterSuite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("This is a beforeTest");
	}
	@AfterTest
	public void at() {
		System.out.println("This is a AfterTest");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is before class method.....");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("This is after class method.....");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is before method.....");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is after method.....");
	}
	
	@Test(priority=1)
	public void tm1()
	{
		System.out.println("This is Test Method1...");
	}
	
	@Test(priority=2)
	public void tm2()
	{
		System.out.println("This is Test Method2...");
	}
	
	

}
