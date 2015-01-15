package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardButtonSimulation {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.navigate().to("https://www.yahoo.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		
	}

}
