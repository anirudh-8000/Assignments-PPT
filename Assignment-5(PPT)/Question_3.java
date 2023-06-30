package Assignment_5_PPT;

import java.util.Arrays;
import java.util.Scanner;

public class Question_3 {
	public static void sorting_square(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Element:");
		int[] arr=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sorting_square(arr);
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+"  ");
        }
	}
}