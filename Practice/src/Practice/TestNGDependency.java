package Practice;

import org.testng.annotations.Test;

public class TestNGDependency {
	
	
	@Test
	public void method1(){
		System.out.println("method1");
		int i = 9/0;
	}
	
	@Test (dependsOnMethods = {"method1"})
	public void method2(){
		System.out.println("method2");
	}
	
	
	
	

}
