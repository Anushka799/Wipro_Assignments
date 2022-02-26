package assignmènt;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = Sc.nextInt();
	boolean flag = false;
	for(int i = 2; i <=n/2; i++) {
		if(n%i == 0) {
			flag = true;		
		}
			
	}
	if(!flag) {
		System.out.println("Number is prime");
		}
	else
		System.out.println("Number is not prime");
	}

}
