package Practice;

public class IFElseConcept {

	public static void main(String[] args) {

		//IF-Else - Conditional Statements
		
		int x = 10;
		int y = 20;
		//Comparison Operators: < > <= >= == <> !=
		if(y>x){
			System.out.println("y is greater than x");
		}
		else{
			System.out.println("x is grtr than y");
		}
		
		boolean b = true;
		if(b){
			System.out.println("True");
		}
		
		//Nested If-Else
		int a1 = 700;
		int b1 = 800;
		int c1 = 300;
		
		if(a1>b1 & a1>c1){
			System.out.println("a1 is greatest");
		}
		else if(b1>c1){
			System.out.println("b1 is greatest");
		}
		else{
			System.out.println("c1 is greatest");
		}
		
		
		
	}

}
