package classCode;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation2 {

	

	public static void main(String[] args) {

		Automation.login();
		
		

		
		Automation.driver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).click();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Automation.driver.findElement(By.xpath("//*[@id=\"drp_div\"]/ul/li/div/div[1]/a")).click();
		//*[@id=\"drp_div\"]/ul/li/div/div[3]/a
		// Check The Log Out Process is complete

		// Check James William is there or Not [ is james is there then its pass or
		// itfailed ]
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 15);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator));
		 */
		String actualProfilename = Automation.driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).getText();
				
		String expectedProfilename = "Login";
		

		if (actualProfilename.equalsIgnoreCase(expectedProfilename)) {
			System.out.println("Logout Test Passed ");
		} else {
			System.out.println("Logout Test Failed... ");
		}

		
	}

}
