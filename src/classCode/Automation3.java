package classCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {

	public static void main(String[] args) {
		// Open Chrome

		WebDriver driver = new ChromeDriver();

		// Go to Applition

		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

		// CLick Login
		driver.findElement(By.id("dLabellogin")).click();

		// Click SignUp

		driver.findElement(By.id("jqSignup")).click();

		// Enter Email
		driver.findElement(By.id("txtEmail")).sendKeys("MRJames@gmail.com");

		// Enter User Name
		driver.findElement(By.id("txtUserName")).sendKeys("MRJames");

		// Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys("ABC123");

		// Enter Cpassword
		driver.findElement(By.id("txtCnfPassword")).sendKeys("ABC123");

		// Enter Fanme

		driver.findElement(By.id("txtFirstName")).sendKeys("MR");

		// Enter Last Name
		driver.findElement(By.id("txtLastName")).sendKeys("James");

		// Enter Address
		driver.findElement(By.xpath("//input[@placeholder='Address *']")).sendKeys("123 People n Tech");

		// Click Check Box

		driver.findElement(By.name("check_news")).click();

		// Click Create Account Button
		driver.findElement(By.id("btnRegister")).click();

	}

}
