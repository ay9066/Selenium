package classCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {

	public static WebDriver driver;
	
	
	public static void login() {

	// Open Chrom from the machine

	// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver"
	// );

	driver = new ChromeDriver();
	// driver = new FirefoxDriver();

	// Go tommulticart side using chrom
	driver.get("https://demo.iscripts.com/multicart/demo/index.php");

	//String title = driver.getTitle();

	// System.out.println(title);
	// validation poit:before all test need validation first

//	if(title.equals("Multi lingual Cart"))
//	{
//		System.out.println("correct title");
//	}else
//	{
//		System.out.println("In-correct title");
//	}
//
//	System.out.println(driver.getCurrentUrl());

	// Click on log in button
	driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();

	// Enter ID
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");

	// Enter Password
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");

	// Click the login Button
	driver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();

	try
	{
		Thread.sleep(1000);
	}catch(
	InterruptedException e)
	{

		e.printStackTrace();
	} // hard break
	
	
	String actualProfileName = driver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
	String expectedProfileName = "Mr PNT2";

	if(actualProfileName.equalsIgnoreCase(expectedProfileName))
	{
		System.out.println("Login Test Passed");
	}else
	{
		System.out.println("Login Test Fail");
	}

	//driver.close();

	// driver.quit();//this will close all window
}
	
	/*
	 * public static void main (String [] args) {
	 * 
	 * driver = new ChromeDriver();
	 * driver.get("https://demo.iscripts.com/multicart/demo/index.php");
	 * 
	 * 
	 * driver.findElement(By.id("dLabellogin")).click();
	 * driver.findElement(By.id("username")).sendKeys("afrina");
	 * driver.findElement(By.id("password")).sendKeys("afrina123");
	 * driver.findElement(By.id("jqLogin")).click();
	 * 
	 * try { Thread.sleep(1000); } catch (InterruptedException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * String actualProfileName = driver.findElement(By.id("dLabel")).getText();
	 * String expectedPrifileName = "Afrina Yeasmin";
	 * 
	 * if(actualProfileName.equalsIgnoreCase(expectedPrifileName)) {
	 * System.out.println("Login Test Pass");
	 * 
	 * } else { System.out.println("Login Test Fail"); }
	 * 
	 * driver.close();
	 * 
	 * }
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
}
