package Practice;

public interface Bank {
	
	int min_bal = 100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	public void loan();
	
	//only method declaration--method prototype
	//no method body
	//we can declare the vars, and vars are static by default
	//values of vars will not changed. by default vars declared with final
	//no static functions are allowed in Interface
	//we can not create the object of Interface
	
	
	

}
