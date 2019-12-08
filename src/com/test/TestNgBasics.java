package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgBasics {
	
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome Brower");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Launch chrome Brower");
		
		
	}
	
	@BeforeSuite
	public void logOut() {
		System.out.println("Launch chrome Brower");
		
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Launch chrome Brower");
		
	}
	
	
	

}
