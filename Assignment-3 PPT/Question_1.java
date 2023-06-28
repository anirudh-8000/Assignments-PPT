package practice;
import java.util.*;

public class Question_1 {
	public static int three_sum_closest(int [] arr,int tar) {
		Arrays.sort(arr);
		int closest_sum=Integer.MAX_VALUE;
		int n=arr.length;
		for(int i=0;i<n-2;i++) {
			int left=i+1;
			int right=n-1;
			
			while(left<right) {
				int curr_sum=arr[i]+arr[left]+arr[right];
				if(curr_sum-tar<closest_sum-tar) {
					closest_sum=curr_sum;
				}
				if(curr_sum<tar) {
					left++;
				}
				else if(curr_sum>tar) {
					right--;
				}
				else {
					return curr_sum;
				}
			}
			
		}
		return closest_sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array Element:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        System.out.println("Enter the Target Element:");
        int tar=sc.nextInt();
        int result=three_sum_closest(arr,tar);
        System.out.println(result);

	}

}
