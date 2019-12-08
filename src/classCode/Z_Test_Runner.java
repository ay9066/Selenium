package classCode;

import java.util.Random;

public class Z_Test_Runner {

	public static void main(String[] args) {

		MCTSmokeTest mytest = new MCTSmokeTest();

		// login test started Here
		mytest.openBrowser();

		mytest.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		mytest.loginTest();

		mytest.waitFor(2000);
		mytest.validateProfileName("AFRINA YEASMIN");

		mytest.closeBrowser();

		// Registration Test

		MCTSmokeTest mytest1 = new MCTSmokeTest();
		mytest1.openBrowser();
		mytest1.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		mytest1.takeMeToSignUpPage();

		Random rand = new Random();
		int regNumber = rand.nextInt(1000);

		mytest1.completeRegistration("afrina"+regNumber+"@gmail.com", "afrina"+regNumber, "afrina", "yeasmin"+regNumber);
		mytest1.waitFor(2000);
		mytest.validateProfileName("afrina yeasmin"+regNumber);

		mytest.closeBrowser();
		
		
		//LogOut Test
		MCTSmokeTest mytest2 = new MCTSmokeTest();
		mytest2.openBrowser();
		mytest2.gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
		mytest.loginTest();

		mytest.waitFor(2000);
		mytest2.logOut();
		mytest1.waitFor(2000);
		mytest2.validateprofileNameNotExist();
		mytest.closeBrowser();

	}

}
