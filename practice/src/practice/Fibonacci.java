package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonaci();

	}

	private static void fibonaci() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		System.out.println("Enter the value till you want:");
		int n = sc.nextInt();
		System.out.print(a);
		System.out.print(b);
		
		for (int i=0; i<n; i++)   
		{  		
		int sum = a+b;
		System.out.print(sum);   
		a=b;
		b=sum;
		}   
		sc.close();
	}

}
