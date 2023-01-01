package practice;

import java.util.Scanner;

public class IntrestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intrest();

	}

	private static void intrest() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount:");
		double principle = sc.nextDouble();
		System.out.println("Enter rate of intrest per month:");
		float rate = sc.nextFloat();
		System.out.println("Enter time in months");
		int time = sc.nextInt();
		System.out.println("The Final amount is: "+ (float)(principle*(1+(rate/100)*time)));
		sc.close();
	}
}
