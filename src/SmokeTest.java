

import java.util.Random;

import mct.pages.HomePage;
import mct.pages.MasterPage;
import mct.pages.MyAccountPage;
import mct.pages.RegPage;

public class SmokeTest {

	public static void main(String[] args) {

		// Login Test

		HomePage home = new HomePage();
		home.goToByUsing("Chrome");
		home.loginTest();

		// Test should do the validation
		String actualProfileName = home.getProfileNameLabel();

		if (actualProfileName.equalsIgnoreCase("Afrina Yeasmin")) {
			System.out.println("Login Test Passed");
		} else {
			System.out.println("Login Test Fail");
		}

		// =====>>>>Log Out Test
		HomePage home2 = new HomePage();
		home2.goToByUsing("Chrome");
		home2.loginTest();
		home2.logOut();

		// Test should do the validation
		String actualProfileName2 = home.getProfileNameLabel();

		if (actualProfileName2.equalsIgnoreCase("Null")) {
			System.out.println("LogOut Test Passed");
		} else {
			System.out.println("LogOut Test Fail");
		}

		// Test SignUp
		HomePage home3 = new HomePage();
		home3.goToByUsing("Chrome");
		home3.takeMeToSignUpPage();

		RegPage regPage = new RegPage();
		
		Random rand = new Random();
		int regNumber = rand.nextInt(1000);
		
		regPage.completeRegistration("afrina"+regNumber+"@gmail.com", "afrina"+regNumber, "afrina", "yeasmin"+regNumber);
		
		String actualProfileName3 = home.getProfileNameLabel();

		if (actualProfileName3.equalsIgnoreCase("afrina yeasmin"+regNumber)) {
			System.out.println("SignUp Test Passed");
		}else {
			System.out.println("SignUp Test Fail");

		}
		
		
		//My Account Page
		
		HomePage home4 = new HomePage();
		home4.goToByUsing("Chrome");
		home4.loginTest();
		home4.takeMeToMyAccountPage();
		
		MyAccountPage myaccount = new MyAccountPage ();
		String actualMyAccount = myaccount.getMyAccountLabel();
		
		if (actualMyAccount.equalsIgnoreCase("My Account")) {
			System.out.println("My Account Page-Test Passed");
		} else {
			System.out.println("My Account Page-Test Fail");
		}
		
		
		
		
	}
}
   


// mytest1.completeRegistration("afrina"+regNumber+"@gmail.com",
// "afrina"+regNumber, "afrina", "yeasmin"+regNumber);
// mytest1.waitFor(2000);
// mytest.validateProfileName("afrina yeasmin"+regNumber);

/*
 * //home.validateProfileName("AFRINA YEASMIN"); //master.closeBrowser();
 * 
 * //reg home.takeMeToSignUpPage();
 * 
 * RegPage regpage = new RegPage();
 * 
 * Random rand = new Random(); int regNumber = rand.nextInt(1000);
 * 
 * regpage.completeRegistration("afrina"+regNumber+"@gmail.com",
 * "afrina"+regNumber, "afrina", "yeasmin"+regNumber);
 * home.validateProfileName("AFRINA YEASMIN"+regNumber);
 * 
 * 
 */

