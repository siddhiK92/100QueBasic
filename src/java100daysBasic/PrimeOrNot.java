package java100daysBasic;
import java.util.Scanner;
public class PrimeOrNot {
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("the no is prime");
		}else {
			System.out.println("the no is not prime");
		}
	}

}
