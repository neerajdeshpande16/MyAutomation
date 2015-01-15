package Practice;

public class TestCar {

	public static void main(String[] args) {

		 final int i =10; //to provide constant values
		 
		
		BMW b = new BMW();
		
		b.start(); //static polymorphism 
		b.stop();
		b.theftSafety();
		b.refuel();
		
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
		Car c1 = new BMW(); //Child class object can be refereed by parent class reference variable - dynamic or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		
		
	}

}
