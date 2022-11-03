package javaexamples;
import java.util.*;


public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner s = new Scanner(System.in);
				int num, i, flag = 0;
				  System.out.println("Enter a Number: ");
				  num=s.nextInt();

				  // 0 and 1 are not prime numbers
				  // change flag to 1 for non-prime number
				  if (num == 0 || num == 1)
				    flag = 1;

				  for (i = 2; i <= num / 2; i++) {

				    // if number is divisible by i, then num is not prime
				    // change flag to 1 for non-prime number
				    if (num % i == 0) {
				      flag = 1;
				      break;
				    }
				  }
				  
				  if (flag == 0)
					  System.out.println(num+" is a prime number.");
				  else
					  System.out.println(num+" is not a prime number.");
			
			}

		}
