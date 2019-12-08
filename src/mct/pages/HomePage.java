package mct.pages;

public class HomePage extends MasterPage {

	String loginLink = "ID:dLabellogin";
	String usernameField = "ID:username";
	String passwordField = "ID:password";
	String loginButton = "ID:jqLogin";
    String signUpButton = "ID:jqSignup";
	String profileNameLabel = "Xpath://*[@id=\"dLabel\"]";
	String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[2]/a";
    
	String myAccountLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	
    public void goToByUsing(String browser) {
		openBrowser(browser);
		gotoURL("https://demo.iscripts.com/multicart/demo/index.php");
	}
	
	public void loginTest() {

		clickElement(loginLink);
		typeOnElement(usernameField, "afrina");
		typeOnElement(passwordField, "afrina123");
		clickElement(loginButton);

	}

	public void takeMeToSignUpPage() {

		clickElement(loginLink);

		clickElement(signUpButton);
	}

	public void logOut() {

		clickElement(profileNameLabel);
		clickElement(logOutLink);

	}
	
	public void takeMeToMyAccountPage() {
		clickElement(profileNameLabel);
		clickElement(myAccountLink);
	}

	public String getProfileNameLabel() {
		
		return getElementText(profileNameLabel);
		
	}
	
	
	  public void closeBrowser() { super.closeBrowser(); }
	  
	 
	public void setProfileNameLabel(String profileNameLabel) {
		this.profileNameLabel = profileNameLabel;
	}

	public void validateProfileName(String expectedValue) {
		// Locators for profile Name
		  String actualProfileName = getElementText(profileNameLabel);
	       String expectedProfileName = expectedValue;

		if (actualProfileName.equalsIgnoreCase(expectedProfileName)) {
			System.out.println("Login Test Passed");
		} else {
			System.out.println("Login Test Fail");
		}
	}

	public void validateprofileNameNotExist() {

		if (elementNotExist(profileNameLabel) == false) {
			System.out.println("Log Out Happened,Test passed");
		} else {
			System.out.println("Log Not Out Happened,Test Failed");
		}
		
		
		
	}
}

