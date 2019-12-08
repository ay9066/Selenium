package mct.testrunner;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mct.pages.HomePage;
import mct.pages.MyAccountPage;
import mct.pages.RegPage;

public class SmokeWithTestng extends TestBase{
	
	//HomePage home;
	
	
//	@BeforeMethod
//	public void rampUp() {
//		home = new HomePage();
//		home.goToByUsing("Chrome");
//		
//	}
//  
	
	@Test
  public void login() {
		//HomePage home = new HomePage();
		//home.goToByUsing("Chrome");
		home.loginTest();

		// Test should do the validation
		String actualProfileName = home.getProfileNameLabel();

		/*
		 * if (actualProfileName.equalsIgnoreCase("Afrina Yeasmin")) {
		 * System.out.println("Login Test Passed"); } else {
		 * System.out.println("Login Test Fail"); }
		 */
		Assert.assertEquals(actualProfileName, "AFRINA YEASMIN","Failed to find ProfileName");

	  
  }
  
  
  @Test
  public void logOut() {
	  //HomePage home = new HomePage();
		//home.goToByUsing("Chrome");
		home.loginTest();
		home.logOut();

		// Test should do the validation
		
		  String actualProfileName = home.getProfileNameLabel();
		  
		/*
		 * if (actualProfileName.equalsIgnoreCase("Null")) {
		 * System.out.println("LogOut Test Passed"); } else {
		 * System.out.println("LogOut Test Fail"); }
		 */
		Assert.assertEquals(actualProfileName, "Null","LogOut does Not Happned");

	  
  }
  
  @Test
  public void signUp() {
	  //HomePage home = new HomePage();
		//home.goToByUsing("Chrome");
		home.takeMeToSignUpPage();

		RegPage regPage = new RegPage();
		
		Random rand = new Random();
		int regNumber = rand.nextInt(1000);
		
		regPage.completeRegistration("afrina"+regNumber+"@gmail.com", "afrina"+regNumber, "afrina", "yeasmin"+regNumber);
		
		String actualProfileName = home.getProfileNameLabel();

		/*
		 * if (actualProfileName.equalsIgnoreCase("afrina yeasmin"+regNumber)) {
		 * System.out.println("SignUp Test Passed"); }else {
		 * System.out.println("SignUp Test Fail");
		 * 
		 * }
		 */
		
		Assert.assertEquals(actualProfileName, "AFRINA YEASMIN"+regNumber,"Failed to find ProfileName after Reg.");
	  
  }
  
  @Test
  public void myAccount() {
	  //HomePage home = new HomePage();
		//home.goToByUsing("Chrome");
		home.loginTest();
		home.takeMeToMyAccountPage();
		
		MyAccountPage myaccount = new MyAccountPage ();
		String actualMyAccount = myaccount.getMyAccountLabel();
		
		/*if (actualMyAccount.equalsIgnoreCase("My Account")) {
			System.out.println("My Account Page-Test Passed");
		} else {
			System.out.println("My Account Page-Test Fail");
		}*/
		Assert.assertEquals(actualMyAccount, "My Account","Failed to go to My Account");
	  
  }
	
//	  @AfterMethod 
//	  public void rampDown() {
//	   home.closeBrowser(); }
//	 
//  
  
}
