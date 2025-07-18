package java100daysBasic;  
import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
		}
		
	}
	
	public static boolean isArmstrong(int num) {
		int sum=0;
		int digits=0;
		int temp=num;
		int original=num;
		while(temp!=0) {
			digits++;
			temp=temp/10;
		}
		temp=num;
		while(temp!=0) {
			int digit=temp%10;
			sum=sum+(int)Math.pow(digit, digits);
			temp=temp/10;
		}
		return sum==original;
	}
}