package mct.testrunner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mct.pages.HomePage;

public class TestBase {
  
	HomePage home;
	
	@BeforeMethod
	public void rampUp() {
		home = new HomePage();
		home.goToByUsing("Chrome");
		
	}
	@AfterMethod 
	  public void rampDown() {
	   home.closeBrowser(); }
	 
	
	
	
	
}
