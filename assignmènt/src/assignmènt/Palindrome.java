package assignmènt;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    String Str,a= "";
    System.out.println("Enter String");
    Str = Sc.next();
    int l = Str.length();
    
    for( int i = l-1; i >=0; i--) {
    	a = a + Str.charAt(i);
    	//sa=a.trim();
    	}
    //System.out.println(a);
    	if(Str.equals(a))
    		System.out.println("Number is palindrome");
    
    	else
    		System.out.println("Number is not palindrome");

	}

}

