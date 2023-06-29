package Assignment_4_PPT;
import java.util.*;

public class Question_4 {
	
	public static int max_pair_sum(int [] arr) {
		Arrays.sort(arr);
		int i=0;
		int sum=0;
		while(i<arr.length) {
			sum+=arr[i];
			i=i+2;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=max_pair_sum(arr);
		System.out.println("Sum of min element pair="+result);

	}

}
