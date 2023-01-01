package practice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		table();

	}

	private static void table() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter still value:");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		
			System.out.println(a+" * "+i+" = " +a*i );
		
		sc.close();
		
	}

}
