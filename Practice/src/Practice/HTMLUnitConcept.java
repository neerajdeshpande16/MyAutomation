package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitConcept {

	public static void main(String[] args) {

		
		WebDriver driver = new HtmlUnitDriver();
		
		//1. No Browser 
		//2. Testing will happen fast
		//3.it will interact with page source of the page
		
		driver.get("https://accounts.google.com"); //enter URL
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test@gmail.com"); //enter UN
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
