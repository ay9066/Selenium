package practicepurpose;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i =9/0;
		
		
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePage() {
		System.out.println("HomePage test");
		
		
	}

}
