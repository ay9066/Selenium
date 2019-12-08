package mct.pages;

public class RegPage extends MasterPage{
	
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
	
	
	public void completeRegistration(String email, String userName, String fName, String lName) {

		
		
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

}
