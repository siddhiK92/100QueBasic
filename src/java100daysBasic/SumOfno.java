package java100daysBasic;
import java.util.Scanner;
public class SumOfno {
//	Find the Sum of the Numbers in a Given Range in Java
	public static void main(String[] args) {
//		    int a = 5;
//		    int b = 10;
//		    int sum = 0;
//		    for (int i = a; i <= b; i++)
//		        sum = sum + i;
//		      System.out.println ("The sum is " + sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		System.out.println("Enter b no");
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum=sum+i;
			System.out.println(sum);
		}
	}

}
