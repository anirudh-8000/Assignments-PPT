package Assignment_5_PPT;

import java.util.Scanner;

public class Question_7 {
    public static int min_element(int [] arr) {
    	System.out.println("Function");
    	int n=arr.length;
    	int s=0;
    	int e=n-1;
    	int mid=(s+e)/2;
    	while(s<e) {    		
    		if(arr[0]<=arr[mid]) {
    			s=mid+1;
    		}
    		else {
    			e=mid;
    		}
    	    mid=(s+e)/2;
    	}
    	return arr[s];
    }
	public static void main(String[] args) {
		System.out.println("Enter the size of Array:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[] =new int[num];
		System.out.println("Enter Element:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int result=min_element(arr);
		System.out.println("Minimum Element:"+result);

	}

}
