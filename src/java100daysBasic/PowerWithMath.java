package java100daysBasic;
import java.util.Scanner;
public class PowerWithMath {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base: ");
		double base=sc.nextDouble();
		System.out.println("Enter exponent: ");
		double exponent=sc.nextDouble();
		double result=Math.pow(base, exponent);
		System.out.println(base+ "raised to the power" + exponent + "is:" +result);
	}

}
