package java100daysBasic;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		
		if(n==reverse(n)) {
			System.out.println("no is reverse");
		}
		else {
			System.out.println("no is not reverse");
		}

	}
	
	static int reverse(int n) {
		
		int reverse=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			reverse=reverse*10+rem;
		}
		return reverse;
	}
	

}
