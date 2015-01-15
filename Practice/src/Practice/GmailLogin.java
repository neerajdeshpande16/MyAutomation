package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) {

	//	WebDriver driver = new FirefoxDriver(); //firefox launch
		
		System.setProperty("webdriver.chrome.driver", "/Users/ndeshpande/Desktop/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com"); //enter URL
		
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test@gmail.com"); //enter UN
		
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("test@gmail.com"); //enter UN

		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("test123"); //enter pwd
		driver.findElement(By.xpath("//*[@id='signIn']")).click(); //click sign-in button
		
	    String error = 	driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText(); //get the text of error messg
		System.out.println(error);
		
		//verification point:
		if(error.contains("incorrect")){
			System.out.println("correct error messg");
		}else{
			System.out.println("in-correct error messg");
		}
		
		
	}

}
