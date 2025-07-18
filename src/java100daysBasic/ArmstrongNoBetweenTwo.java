package java100daysBasic;

import java.util.Scanner;

public class ArmstrongNoBetweenTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting no: ");
		int start = sc.nextInt();
		System.out.println("Enter ending no: ");
		int end = sc.nextInt();

		for (int num = start; num < end; num++) {
			int original = num;
			int sum = 0;
			int digits = 0;
			int temp = num;
			while (temp != 0) {
				digits++;
				temp = temp / 10;
			}
			temp = num;
			while (temp != 0) {
				int digit = temp % 10;
				sum = sum + (int) Math.pow(digit, digits);
				temp = temp / 10;
			}

			if (sum == original) {
				System.out.println(original);
			}

		}
	}

}
