package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //open Firefox
		
		driver.get("http://www.google.com"); //Enter URL
		
		System.out.println(driver.getTitle()); 
		
		String title = driver.getTitle(); //get the title of the page
		
		//verification point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}else{
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
		driver.quit(); //close the browser
		
	}

}
