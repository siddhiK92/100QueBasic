package java100daysBasic;
import java.util.Scanner;
public class GreatestOf2Numbers {

//	public static void main(String[] args) {
//		 int num1 = 50, num2 = 20;
//	     if (num1 == num2)
//	       System.out.println ("both are equal");
//	     else if (num1 > num2)
//	         System.out.println (num1 + " is greater");
//
//	     else
//	         System.out.println (num2 + " is greater");
//	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no 1: ");
		int n1=sc.nextInt();
	System.out.println("Enter no 2: ");
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println("no 1 is greatest no");
		}else {
			System.out.println("no 2 is greatest no");
		}
		
	}

}
