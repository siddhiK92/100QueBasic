package java100daysBasic;
import java.util.Scanner;
public class Greatestof3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 st no:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd no:");
		int n2=sc.nextInt();
		System.out.println("Enter 3rd no:");
		int n3=sc.nextInt();
		if(n1>=n2 && n1>=n3) {
			System.out.println("n1 is greatest");
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.println("n2 is gratest");
		}
		else {
			System.out.println("n3 is greatest");
		}
	}

}
