package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.half.ebay.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'actextbox')]")).sendKeys("12345");
		
		//Relative xpath --- > //input[@id='email']
		//Abs Xpath --> html/body/div/div[1]/div[2]//input
		
		
		
	}

}
