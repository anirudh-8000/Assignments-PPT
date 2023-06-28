package practice;

import java.util.*;

public class Question_3 {
	
	public static void next_permutation(int []arr){
		int n=arr.length;
		int i=n-1;
		while(i>0&& arr[i-1]>=arr[i]) {
			i--;
		}
		if(i==0) {
			reverse(arr,0);
		}
		else {
			int j=0;
			for( j=i;j<n;j++) {
				if(arr[i-1]>arr[j]) {
					break;
				}
			}
			j--;
			i--;
			int num=arr[i];
			arr[i]=arr[j];
			arr[j]=num;
			reverse(arr,i+1);
		}
	}

	private static void reverse(int[] arr,int start) {
		// TODO Auto-generated method stub
		int i = start;
        int j = arr.length - 1;
        while (i < j) {
            int num=arr[i];
            arr[i]=arr[j];
            arr[j]=num;
            i++;
            j--;
        }
		
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
        next_permutation(arr);
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]);
        }

	}

}
