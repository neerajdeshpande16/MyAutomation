package Practice;

public class HSBCBank implements Bank{ //"Is-A" relationship
	
	//1. If a class is implementing any Interface, 
	//then it's compulsory/mandatory to define(override) all the methods of Interface
	
	
	
	public void debit(){
		System.out.println("HSBC--debit");
	}
	
	
	public void credit(){
		System.out.println("HSBC--credit");
	}
	
	
	public void transferMoney(){
		System.out.println("HSBC--transferMoney");
	}
	
	
	public void loan(){
		System.out.println("HSBC--loan");
	}
	
	public void creditCard(){
		System.out.println("HSBC--Credit Card");
	}
	
	

}
