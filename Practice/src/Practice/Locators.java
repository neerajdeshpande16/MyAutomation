package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //firefox launch
		driver.manage().window().maximize(); //to maximize the window
		
		driver.get("https://accounts.google.com"); //enter URL
		
		driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("Passwd")).sendKeys("test123");
		
		driver.findElement(By.id("signIn")).click();
		
		driver.findElement(By.linkText("Create an account")).click();
		
		
	}

}
