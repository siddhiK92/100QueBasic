package java100daysBasic;
import java.util.Scanner;
public class NNturalNo {

//	public static void main(String[] args) {
//	     int n = 10;
//	     int sum = 0;
//	     for (int i = 1; i <= n; i++)
//	         sum += i;
//	       System.out.println (sum);
//	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n no: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			System.out.println(sum);
		}
	}
}



