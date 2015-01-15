package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept {

	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver();
		//synchronization wait, implicit wait, dynamic wait, Ajax handling
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		
		driver.get("http://www.half.ebay.com/");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='m']")));
		
		select.selectByVisibleText("Books");
		select.selectByIndex(5);
		
		
		
		
		
		
	}

}
