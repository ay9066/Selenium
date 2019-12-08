package mct.testrunner;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mct.pages.HomePage;
import mct.pages.MyAccountPage;

public class RegressionWithTestng extends TestBase{

	//HomePage home;

	//@BeforeMethod
	//public void rampUp() {
		//home = new HomePage();
		//home.goToByUsing("Chrome");

	//}

	@Test
	public void MyAccountOption() {

		home.loginTest();
		home.takeMeToMyAccountPage();
		MyAccountPage myaccount = new MyAccountPage();
		myaccount.getAllOptions();

		List<String> actualOptionResult = myaccount.getAllOptions();

		// Exp List Using Manually
//		List<String> expOptionResult = new ArrayList<>();
//		expOptionResult.add("My Orders");
//		expOptionResult.add("Profile");
//		expOptionResult.add("My Return Requests");
//		expOptionResult.add("Change Password");
//		expOptionResult.add("My Favorite Products");
//		expOptionResult.add("My Favorite Sellers");
//		expOptionResult.add("My Favorite Sellers");

		//assertThat("Minimum One is Missing", equals(expOptionResult));
		
	
		
	
	}

	/*
	 * @AfterMethod public void rampDown() { home.closeBrowser(); }
	 */
}
