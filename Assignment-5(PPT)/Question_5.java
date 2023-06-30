package Assignment_5_PPT;

import java.util.Scanner;

public class Question_5 {
	
	 public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
	        int n1=arr1.length;
	        int n2=arr2.length;
	        int ans=0;
	        int count=0;
	        for(int i=0;i<n1;i++){
	            count=0;
	            for(int j=0;j<n2;j++){
	                if(Math.abs(arr1[i]-arr2[j])<=d ){
	                    j=n2;
	                }
	                else{
	                    count++;
	                }
	            }
	            if(count==n2){
	                ans++;
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of First Array:");
		int n1=sc.nextInt();
		System.out.println("Enter the First Array Element:");
		int[] arr1=new int[n1]; 
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of Second Array:");
		int n2=sc.nextInt();
		System.out.println("Enter the Second Array Element:");
		int[] arr2=new int[n2]; 
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter the distance value:");
		int d=sc.nextInt();
		int result=findTheDistanceValue(arr1,arr2,d);
        System.out.println("Answer:"+result);
	}
}