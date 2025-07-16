package java100daysBasic;
import java.util.Scanner;
public class LeapOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int yr=sc.nextInt();
		if(yr%4==0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("this is not a leap year");
		}

	}

}
