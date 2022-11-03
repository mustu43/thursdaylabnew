package javaexamples;

import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);
		int rev=0,m,temp,remi;
		System.out.println("Enter a number :"); // 
		m=t.nextInt();
		temp=m;
		while(m>0)
		{
			remi=m%10;
			rev=rev*10+remi;
			m=m/10;
		}
		if(temp==rev)
		System.out.println("The given number "+temp+" is a palindrome Number");
		else
		System.out.println("The given number "+temp+" is not a palindrome Number");	
	}

}