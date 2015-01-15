package Practice;

public class ArrayConcept {

	public static void main(String[] args) {

		//To store the similar data types values in single variable, we use Array.
		
		//Dis-Advantages of array:
		//1. Size is fixed [static Array]: To Overcome this problem, we use Collections - Dynamic Arrays
		//2. Store only similar data types values: To Overcome this problem, we use Object Array.
		
		//1. int array:
		
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]); Exception - ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); //size of array
		
		//print all the values of array: use for loop
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		
		//2. double array:
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=34.33;
		
		//3. char array:
		char c[] = new char[3];
		c[0]='a';
		c[1]='v';
		c[2]='$';
		
		//4. boolean array:
		boolean b[] = new boolean[2];
		
		//5. String array:
		String s[] = new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		
		//6. Object Array:
		Object ob[] = new Object[4];
		ob[0]="Tom";
		ob[1]=26;
		ob[2]='M';
		ob[3]=50.55;
		
		
		
		
		
	}

}
