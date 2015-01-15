package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadPropertiesFile {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException {

		
		Properties prop = new Properties();
		
		FileInputStream fip = new FileInputStream("/Users/nkhunte/Documents/workspace/VoddicSeleniumClasses/src/JavaPractice/config.properties");
		
		prop.load(fip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("dob"));
		
		
	   String browserName =prop.getProperty("browser");
	   
	   if(browserName.equals("firefox")){
		    driver = new FirefoxDriver();
	   }else if(browserName.equals("safari")){
		    driver = new SafariDriver();
	   }else if(browserName.equals("chrome")){
		   System.setProperty("webdriver.chrome.driver", "/Users/nkhunte/Downloads/chromedriver");
			driver = new ChromeDriver();
	   }
		
		driver.get(prop.getProperty("URL"));
		
		
		
		
		
		
	}

}
