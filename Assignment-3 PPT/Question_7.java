package practice;
import java.util.*;

public class Question_7 {
	public static void solve(int[]arr,int lower,int upper) {
		if(arr[0]>lower) {
			System.out.println("["+(lower+1)+","+(arr[0]-1)+"]");
		}
         int n=arr.length;
		for(int i=1;i<n;i++ ) {
			if(arr[i]-arr[i-1]>1) {
				System.out.println("["+(arr[i-1]+1)+","+(arr[i]-1)+"]");
			}
		}
		if(arr[n-1]<upper)
		System.out.println("["+(arr[n-1]+1)+","+(upper-1)+"]");
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Sorted Array Element:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        System.out.println("Enter the lower and upper range:");
        int lower=sc.nextInt();
        int upper =sc.nextInt();
        solve(arr,lower,upper);

	}

}
