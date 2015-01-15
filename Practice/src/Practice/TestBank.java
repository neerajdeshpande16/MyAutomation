package Practice;

public class TestBank {

	public static void main(String[] args) {

		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.loan();
		hs.creditCard();
		System.out.println(Bank.min_bal);
		
		
		Bank b = new HSBCBank(); 
		b.debit();
		b.credit();
		b.transferMoney();
		b.loan();
		
		
		
	}

}
