package javaexamples;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    int a,b;
	    Scanner sc=new Scanner(System.in);

	    System.out.println("Enter 2 num:");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println("before swap:"+a+" "+b);
	    
		int temp = a;
	    a = b;
	    b = temp;
	    System.out.println("After swap:"+a+" "+b);

	}

}
