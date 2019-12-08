package mct.pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {
	
	public static WebDriver driver;
	
	public void openBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
					 
		driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
		
			driver = new FirefoxDriver();
			
			
		}

	
		}
	
	public void gotoURL(String url) {
		driver.get(url);
	}
	
	public void clickElement(String locatores) {
		if (locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).click();
		     waitFor(1000);
		} else if (locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).click();
			waitFor(1000);
		} else if (locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();
			waitFor(1000);
		}

	}
public List<String> getElementsText(String locatorsOfElements) {
		
		List<String> actualOptionResultList = new ArrayList<>();

		
		if(locatorsOfElements.contains("Xpath")) {
			List<WebElement> alloptionsinUI = driver.findElements(By.xpath(locatorsOfElements.split(":")[1]));
			System.out.println("Total List Size " + alloptionsinUI.size() );
			for(int i=0;i<alloptionsinUI.size();i++) {
				System.out.println(alloptionsinUI.get(i).getText());
				actualOptionResultList.add(alloptionsinUI.get(i).getText());
			}
		} 

		
		return actualOptionResultList;
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
		try {
		if (locatores.contains("ID")) {
			return driver.findElement(By.id(locatores.split(":")[1])).getText();

		} else if (locatores.contains("Xpath")) {
			return driver.findElement(By.xpath(locatores.split(":")[1])).getText();

		}else if (locatores.contains("Name")) {
			return driver.findElement(By.name(locatores.split(":")[1])).getText();
		}
	
		}catch(Exception e) {
			return "Null";
		}
		
		return "Null";
		
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
	
	  public void closeBrowser() 
	  { 
		  driver.close(); 
	  
	  }
	 
	// =========Validation Function
	
		public void waitFor(int mls) {
			try {
				Thread.sleep(mls);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			
		}
}
