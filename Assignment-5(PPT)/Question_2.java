package Assignment_5_PPT;
import java.util.Scanner;

public class Question_2 {
	public static int stairs(int n) {
		int ans = (int) ((-1 + (Math.sqrt(1 + 8*n))) / 2);
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=stairs(n);
		System.out.println(result);
	}
}