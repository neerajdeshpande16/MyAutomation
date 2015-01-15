package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//Alert API - to handle alert/java script pop-up
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String msg = alert.getText(); //used to get the text present on alert pop-up
		
		if(msg.equals("Please enter a valid user name")){
			System.out.println("correct error messg");
		}else{
			System.out.println("in-correct error messg");
		}
		
		Thread.sleep(5000); //static wait
		
		alert.accept(); //click on Ok button
		//alert.dismiss(); //click on Cancel button
		
		
	}

}
