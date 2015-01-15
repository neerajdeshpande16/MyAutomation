package Practice;
// Main Class
public class TestCoffee {

	public static void main(String[] args) {
		
		System.out.println("Starbucks Class methods");
		 Starbucks sb = new Starbucks();
		 sb.mocha();
		 sb.frappachino();
		 sb.hotchocolate();
		 
		System.out.println("+++++++++++++++++++++++++++"); 
		System.out.println("Peets Class methods");
		 Peets pt = new Peets();
		 pt.frappachino();
		 pt.hotchocolate();
		 pt.mocha();
		 
		 System.out.println("+++++++++++++++++++++++++++"); 
		 System.out.println("PeetsAtSf - inherited class methods");
		
		 PeetsAtSf psf = new PeetsAtSf();
		 psf.mocha();
		 psf.greenTea();
		 psf.chaiLatte();
		 
		 System.out.println("+++++++++++++++++++++++++++"); 
		 System.out.println("Methods part of parent Peets class called using child class object");
		 psf.frappachino();
		 psf.hotchocolate();

	}

}
