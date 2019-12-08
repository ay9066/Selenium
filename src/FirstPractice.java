import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstPractice {

	public static void main(String[] args) {
		// Open Chrom from the machine

		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver"
		// );

		WebDriver mydriver = new ChromeDriver();
		//WebDriver mydriver = new FirefoxDriver();

		// Go tommulticart side using chrom
		mydriver.get("https://demo.iscripts.com/multicart/demo/index.php");

		String title = mydriver.getTitle();

		// System.out.println(title);
		// validation poit:before all test need validation first

		if (title.equals("Multi lingual Cart")) {
			System.out.println("correct title");
		} else {
			System.out.println("In-correct title");
		}

		System.out.println(mydriver.getCurrentUrl());

		// Click on log in button
		mydriver.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();

		// Enter ID
		mydriver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");

		// Enter Password
		mydriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");

		// Click the login Button
		mydriver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		} // hard break
		String actualProfileName = mydriver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
		String expectedProfileName = "James williums";

		if (actualProfileName.equalsIgnoreCase(expectedProfileName)) {
			System.out.println("Login Test Passed");
		} else {
			System.out.println("Login Test Passed");
		}

		mydriver.close();
		 //driver.quit();//this will close all window

	}
}
