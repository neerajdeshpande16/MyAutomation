package Practice;

import org.testng.annotations.Test;

public class TestNGTimeSet {

	
	@Test (timeOut = 1000)
	public void infiniteLoopTest(){
		while(true);
	}
	
	
	
	
	
}
