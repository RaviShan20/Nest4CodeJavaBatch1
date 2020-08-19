package assignments;

import java.util.Scanner;
import java.lang.Math;

public class Day4 {
	
	// Count number of even or odd digits
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = Math.abs(scan.nextLong());
		countEvenOddDigits(num);
		scan.close();
		
	}

	static void countEvenOddDigits(long n) {
		
	    String number = String.valueOf(Math.abs(n));
		System.out.println(number);
		int countOfOddDdigits = 0;
		int countOfEvenDdigits = 0;
		for(int i=0;i<number.length();i++) {
			
			if(number.charAt(i) % 2 == 0) {
				countOfEvenDdigits += 1;
			}
			
			else {
			    countOfOddDdigits += 1;
			}
			
		}
		
		System.out.println("Odd Digit: " + countOfOddDdigits);
		System.out.println("Even Digit: " + countOfEvenDdigits);
		
	}
	
	
		
	}