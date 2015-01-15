package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NewGmailLogin {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		FileInputStream fip = new FileInputStream("/Users/nkhunte/Documents/workspace/VoddicSeleniumClasses/src/JavaPractice/locators.properties");
		
		prop.load(fip);
		
		
		String browserName =prop.getProperty("browser");
		   
		   if(browserName.equals("firefox")){
			    driver = new FirefoxDriver();
		   }else if(browserName.equals("safari")){
			    driver = new SafariDriver();
		   }else if(browserName.equals("chrome")){
			   System.setProperty("webdriver.chrome.driver", "/Users/nkhunte/Downloads/chromedriver");
				driver = new ChromeDriver();
		   }
		driver.get(prop.getProperty("URL")); //enter URL
		
		
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys("test@gmail.com"); //enter UN		
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys("test123"); //enter pwd
		driver.findElement(By.xpath(prop.getProperty("sign_in_xpath"))).click(); //click sign-in button
		
		
		
	}

}
