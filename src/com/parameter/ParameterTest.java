package com.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({"env", "browser","url", "emailID" })
	public void yahooLoginTest(String env,String browser, String url, String emailID) {

		if (browser.equals("chrome")) {
			driver = new FirefoxDriver();
		} else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(url);

		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailID);

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[3]")).click();
		driver.close();

	}

}
