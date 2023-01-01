package practice;

import java.util.Scanner;

public class SumOfTwoNumbers {
public static void main(String[] args) {
	
	sum();
}

private static void sum() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first value ");
	int a=sc.nextInt();
	System.out.println("Enter second value ");
	int b=sc.nextInt();
	System.out.println(a+b);
	sc.close();
}
}
