package Assignment_4_PPT;

import java.util.Scanner;

public class Question_8 {
	public static int[] arrange(int[] arr) {
		int n= arr.length;
		int left=0;
		int right=n/2;
		int [] ans=new int[n];
		int i=0;
		while(i<n) {
			ans[i]=arr[left++];
			i++;
			ans[i]=arr[right++];
			i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Element:");
		int[] arr=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int [] ans=arrange(arr);
		for(int i=0;i<n;i++) {
        	System.out.print(ans[i]+"  ");
        }
	}

}
