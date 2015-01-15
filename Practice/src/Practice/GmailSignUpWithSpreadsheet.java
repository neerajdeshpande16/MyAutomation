package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignUpWithSpreadsheet {

	
	public static void main(String args[]){
		
		// Spreadsheet location
		XLS_Reader reader = new XLS_Reader("/Users/ndeshpande/Desktop/Selenium/GmailSignUp.xlsx");		
		
		// Go to Gmail Sign Up Page
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath(".//*[@id='link-signup']")).click();   
		
		int rowCount = reader.getRowCount("UserInfo");                              // get rowcount from spreadsheet
		
		// Loop to enter multiple user details on Gmail Page
		
		for(int rowNum=2; rowNum<=rowCount; rowNum++){
			System.out.println("rowNum = "+rowNum);
			
			// reading user data from the spreadsheet.
			String firstname = reader.getCellData("UserInfo", "firstname", rowNum);              
			String lastname = reader.getCellData("UserInfo", "lastname", rowNum);				
			String username = reader.getCellData("UserInfo", "username", rowNum);
			String password = reader.getCellData("UserInfo", "password", rowNum);
			String confpwd = reader.getCellData("UserInfo", "confirmpwd", rowNum);
			String day = reader.getCellData("UserInfo", "day", rowNum);
			String year = reader.getCellData("UserInfo", "year", rowNum);
			String cellphone = reader.getCellData("UserInfo", "cellphone", rowNum);
			String email = reader.getCellData("UserInfo", "email", rowNum);
			
			// set user data on sign up form for gmail
			
			driver.findElement(By.xpath(".//*[@id='FirstName']")).clear();
			driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys(firstname);		// enter firstname 
			
			driver.findElement(By.xpath(".//*[@id='LastName']")).clear();
			driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys(lastname);;		// enter lastname
			
			driver.findElement(By.xpath(".//*[@id='GmailAddress']")).clear();
			driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys(username);	// enter username
			
			driver.findElement(By.xpath(".//*[@id='Passwd']")).clear();
			driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(password);			// enter password
			
			driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).clear();
			driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys(confpwd);  	// enter confirm password
			
			driver.findElement(By.xpath(".//*[@id='BirthDay']")).clear();
			driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys(day);       		 // birth date
			
			driver.findElement(By.xpath(".//*[@id='BirthYear']")).clear();
			driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys(year);    		// birth year
			
			driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).clear();
			driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys(cellphone);  // cellphone
			
			driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).clear();
			driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys(email);     // email
			
			
		}// End for loop -- Entering multiple user data
		
		
	}  // end main
	
	
	
}
