package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginParameterization {

	public static void main(String[] args) {

		
		XLS_Reader reader = new XLS_Reader("/Users/nkhunte/Desktop/GmailTestData.xlsx");
		
		String username = reader.getCellData("login", "username", 2);
		
		System.out.println(username);
		
		String password = reader.getCellData("login", "password", 7);
		System.out.println(password);
		
		
		reader.addColumn("login", "Number");
		
		reader.setCellData("login", "Number", 2, "890-0909-099");
		
		reader.addSheet("Yahoo");
		
		
		System.out.println(reader.getRowCount("login"));
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		
		int rowCount = reader.getRowCount("login");
		
		for(int row =2; row<=rowCount; row++){
			
			String userName = reader.getCellData("login", "username", row);
			String passWord = reader.getCellData("login", "password", row);
			
			driver.findElement(By.xpath("//*[@id='Email']")).clear();
			driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(userName);
			
			driver.findElement(By.xpath("//*[@id='Passwd']")).clear();
			driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(passWord);
			
			driver.findElement(By.xpath("//*[@id='signIn']")).click();
			
			
			
		}
		
		
	}

}
