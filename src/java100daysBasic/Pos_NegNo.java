package java100daysBasic;
import java.util.Scanner;
public class Pos_NegNo {

//	public static void main(String[] args) {
//		int num=5;
//		if(num>0)
//			if (num > 0)
//		        System.out.println ("The number is positive");
//		    else if (num < 0)
//		        System.out.println ("The number is negative");
//		    else
//		        System.out.println ("Zero");
//		 }
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("no is positive no");
		}else {
			System.out.println("no is negative no");
		}
	}
}
	
