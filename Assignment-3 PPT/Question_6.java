package practice;

import java.util.Scanner;

public class Question_6 {
	
	public static int unique(int[] arr) {
		int n=arr.length;
		int result=0;
		for(int i=0;i<n;i++) {
			result^=arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array Element:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        int result=unique(arr);
        System.out.println("The unique Element: "+result);
	}

}
