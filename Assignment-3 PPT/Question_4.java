package practice;

import java.util.Scanner;

public class Question_4 {
	public static int solve(int []arr,int n,int target) {
		int first=0,last=n-1;
		int ans=-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==target) {
				ans=mid;
				return ans;
			}
			else if(arr[mid]<target) {
				first=mid+1;
				ans=mid;
			}
			else {
				last=mid-1;
				ans=mid;
			}
		}
		return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Element:");
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target Element:");
		int target=sc.nextInt();
		System.out.println("Index is:"+solve(arr,n,target));
	}
}


