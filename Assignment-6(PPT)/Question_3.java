package Assignment_6_PPT;

import java.util.Scanner;

public class Question_3 {
	public static boolean moutain_array(int[]arr) {
		int n=arr.length;
		int max=0;
		int maxIndex=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxIndex=i;
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(i<maxIndex) {
				if(arr[i]<arr[i+1]) {
					count++;
				}
			}
			if(i>maxIndex) {
				if(arr[i-1]>arr[i]) {
					count++;
				}
			}
		}
		if(count==(n-1)) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Length of Array:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter Element::");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		boolean result=moutain_array(arr);
		System.out.println(result);
        sc.close();
	}

}
