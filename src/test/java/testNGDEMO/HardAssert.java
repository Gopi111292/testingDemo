package testNGDEMO;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	
	@Test
	public void test() {
		
		//Assert.assertEquals("xyz", "xyz");
		//Assert.assertEquals(123,245);
		
		
		//Assert.assertNotEquals(123, 123); //fail
		Assert.assertNotEquals(123,234);
		
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		
		
		Assert.assertTrue(1==2); //fail
		
		Assert.assertTrue(1==1); //pass
		
		Assert.assertFalse(1==2) // pass
		Assert.assertFalse(1==1) // fail
		
		Assert.fail();
		
		
		
	}

}
