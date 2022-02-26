package assignmènt;

import java.util.Scanner;

public class PosNos {
	public static void main(String[] args) {
		int n ;
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter Number");
    n = Sc.nextInt();
    if(n>0)
    	System.out.println("enter positive number");
    else if(n<0)
    	System.out.println("enter negative number");
    else
    	System.out.println("");

	}

}
