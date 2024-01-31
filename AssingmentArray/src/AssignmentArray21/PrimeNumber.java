package AssignmentArray21;

import java.util.Scanner;

public class PrimeNumber {
	void number1(int a) {
		System.out.println("number");
		
		/*if(a%2==0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is odd");
		}*/
	}
  
	public static void main(String[] args) {
	Scanner	ref=new Scanner(System.in);
	int a;
	System.out.println("Enter a number");
	a=ref.nextInt();
	PrimeNumber r1=new PrimeNumber();
	r1.number1(a);
	}
	
}

	
		
