package java100daysBasic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<n;i++) {
			int temp=a+b;
			a=b;
			b=temp;
		}
		
	}

}
