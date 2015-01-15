package Practice;

import org.testng.annotations.Test;

public class TestNgGroup {
	

	
	@Test (groups = "Inbox")
	public void method1Test(){
		System.out.println("MT1");
	}
	
	
	@Test (groups = "SentMail")
	public void method2Test(){
		System.out.println("MT2");
	}
	
	
	@Test (groups = "Inbox")
	public void method3Test(){
		System.out.println("MT3");
	}
	
	@Test (groups = "SentMail")
	public void method4Test(){
		System.out.println("MT4");
	}
	
	
	
	@Test (groups = "Search")
	public void method5Test(){
		System.out.println("MT1");
	}
	
	
	@Test (groups = "Search")
	public void method6Test(){
		System.out.println("MT2");
	}
	
	
	@Test (groups = "Trash")
	public void method7Test(){
		System.out.println("MT3");
	}
	
	@Test (groups = "Draft")
	public void method8Test(){
		System.out.println("MT4");
	}
	
	
	

}
