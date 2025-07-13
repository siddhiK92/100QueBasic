package java100daysBasic;
import java.util.Scanner;

public class Even_OddNo {

//	public static void main(String[] args) {
//		int number = 29;
//	 
//	     if (number % 2 == 0)
//	              System.out.println(number + " is Even");
//	     else
//	              System.out.println(number + " is odd");
//	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}

	}


}
