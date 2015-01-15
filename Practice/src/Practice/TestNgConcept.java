package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgConcept {
	
	//1
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Open Browser");
	}
	
	//2 //5 //8
	@BeforeMethod
	public void login(){
		System.out.println("Login method");
	}
	
	//3
	@Test (priority=0)
	public void inboxTest(){
		System.out.println("Inbox test");
	}
	
	//6
	@Test  (priority=2)
	public void searchTest(){
		System.out.println("Search Test");
	}
	
	//9
	@Test (priority=1)
	public void composeMailTest(){
		System.out.println("Compose Mail Test");
	}
	
	@Test (priority=3)
	public void spamTest(){
		System.out.println("Spam Test");
	}
	
	
	
	//4 //7 //10
	@AfterMethod
	public void logout(){
		System.out.println("Logout");
	}
	
	//11
	@AfterClass
	public void quitBrowser(){
		System.out.println("Quit Browser");
	}
	
	
	
	
	
	

}
