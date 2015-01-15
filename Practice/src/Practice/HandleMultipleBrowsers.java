package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HandleMultipleBrowsers {

	public static void main(String[] args) {

		
		//1. Firefox
		//WebDriver driver = new FirefoxDriver();
		
		//2. Safari
		//WebDriver driver = new SafariDriver();
		
		//3. Chrome
		//http://chromedriver.storage.googleapis.com/index.html
		System.setProperty("webdriver.chrome.driver", "/Users/nkhunte/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//If you dont define the system property, it will throw IllegalStateException.
		
		
		driver.get("http://www.google.com");
		
		//4. IE
//		System.setProperty("webdriver.ie.driver", "/Users/nkhunte/Downloads/iedriver");
//		WebDriver driver = new InternetExplorerDriver();

		
		
		
		
	}

}
