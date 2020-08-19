package assignments;

import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height feet part");
		int heightfeet = scan.nextInt();
		System.out.println("Enter the height inch part");
		int heightinch = scan.nextInt();
		float result = heightCovertor(heightfeet,heightinch);
		System.out.println("Height in cms is :" + result);
		
		System.out.println("Enter the weight in kgs: ");
		int weightInKgs = scan.nextInt();
		float weightInPounds = weightConverter(weightInKgs);
		System.out.println("Weight in Pounds is: " + weightInPounds);
		scan.close();
	}
	
	static float heightCovertor(int heightFeetPart,int heightInchPart) {
		
		float heightInCms = (float) (heightFeetPart*12*2.54 + heightInchPart*2.54);
		return heightInCms;
	}
	
	static float weightConverter(int weight) {
		
		float result = (float) (weight*2.2);
		return result;
	}
	
	

}
