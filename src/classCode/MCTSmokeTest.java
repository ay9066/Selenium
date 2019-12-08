package classCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCTSmokeTest {

	// Main Driver
	public static WebDriver driver;

	// Base function
	public void openBrowser() {
		driver = new ChromeDriver();

	}

	public void gotoURL(String url) {
		driver.get(url);
	}

	public void takeMeToSignUpPage() {

		String loginLink = "ID:dLabellogin";
		String signUpButton = "ID:jqSignup";

		clickElement(loginLink);

		clickElement(signUpButton);
	}
	// test function

	public void loginTest() {

		String loginLink = "ID:dLabellogin";
		String usernameField = "ID:username";
		String passwordField = "ID:password";
		String loginButton = "ID:jqLogin";

		clickElement(loginLink);
		typeOnElement(usernameField, "afrina2");
		typeOnElement(passwordField, "afrina123");
		clickElement(loginButton);

	}

	// ====================
	// Utility Function
	public void clickElement(String locatores) {
		if (locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).click();
		} else if (locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).click();

		} else if (locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();

		}

	}

	public void typeOnElement(String locatores, String valueTotype) {
		if (locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).sendKeys(valueTotype);

		} else if (locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).sendKeys(valueTotype);

		} else if (locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();

		}
	}

	public String getElementText(String locatores) {
		if (locatores.contains("ID")) {
			return driver.findElement(By.id(locatores.split(":")[1])).getText();

		} else if (locatores.contains("Xpath")) {
			return driver.findElement(By.xpath(locatores.split(":")[1])).getText();

		}
		return "";

	}

	public boolean elementNotExist(String locatores) {
		try {
		  if (locatores.contains("ID")) {
			return driver.findElement(By.id(locatores.split(":")[1])).isDisplayed();
		} else if (locatores.contains("Xpath")) {
			return driver.findElement(By.xpath(locatores.split(":")[1])).isDisplayed();

		} else if (locatores.contains("Name")) {
			return driver.findElement(By.name(locatores.split(":")[1])).isDisplayed();

		}
		}catch(Exception e) {
		
			return false;
		
	}return false;
		}
	public void closeBrowser() {
		driver.close();
	}

	// =========Validation Function
	public void validateProfileName(String expectedValue) {
		// Locators for profile Name
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]";
		String actualProfileName = getElementText(profileNameLabel);

		String expectedProfileName = expectedValue;

		if (actualProfileName.equalsIgnoreCase(expectedProfileName)) {
			System.out.println("Login Test Passed");
		} else {
			System.out.println("Login Test Fail");
		}
	}

	public void validateprofileNameNotExist() {
		String profileNameLabel = "Xpath://*[@id=\\\"dLabel\\";

		if (elementNotExist(profileNameLabel) == false) {
			System.out.println("Log Out Happened,Test passed");
		} else {
			System.out.println("Log Not Out Happened,Test Failed");
		}

	}

	public void waitFor(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void completeRegistration(String email, String userName, String fName, String lName) {

		// Locator for REGISTRATION
		String emailField = "ID:txtEmail";
		String userNameField = "ID:txtUserName";
		String passwardField = "ID:txtPassword";
		String cofPasswordField = "ID:txtCnfPassword";
		String firstNameField = "ID:txtFirstName";
		String lastNameField = "ID:txtLastName";
		String addressField = "Xpath://input[@placeholder='Address *']";
		String checknewsBox = "Name:check_news";
		String btnRegister = "ID:btnRegister";

		typeOnElement(emailField, email);
		typeOnElement(userNameField, userName);
		typeOnElement(passwardField, "afrina123");
		typeOnElement(cofPasswordField, "afrina123");
		typeOnElement(firstNameField, fName);
		typeOnElement(lastNameField, lName);
		typeOnElement(addressField, "9324,abc");

		clickElement(checknewsBox);
		clickElement(btnRegister);

	}

	public void logOut() {
		String profileNameLabel = "Xpath://*[@id=\"dLabel\"]";
		String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[3]/a";

		clickElement(profileNameLabel);
		clickElement(logOutLink);

	}

}
