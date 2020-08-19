package assignments;

import java.util.Scanner;

public class Day3 {
	
	public static void main(String[] args) {
		
		// String Exchange
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		String firstTwoOfS1 = s1.substring(0,2);
		String lastTwoOfS1 = s1.substring(s1.length() - 2 ,s1.length());
		
		String firstTwoOfS2 = s2.substring(0,2);
		String lastTwoOfS2 = s2.substring(s2.length() - 2 ,s2.length());
		
		String finalString1 = lastTwoOfS2 + s1.substring(2, s1.length() - 2) + firstTwoOfS2;
		String finalString2 = lastTwoOfS1 + s2.substring(2, s2.length() - 2) + firstTwoOfS1;
		
		System.out.println("First String After String Exchange:" + finalString1);
		System.out.println("Second String After String Exchange:" + finalString2);
		
		scan.close();
		
	}

}
