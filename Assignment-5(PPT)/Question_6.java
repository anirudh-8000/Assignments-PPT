package Assignment_5_PPT;

import java.util.*;

public class Question_6 {
	
	public static ArrayList<Integer> duplicate(int[] arr){
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n=arr.length;
		int []temp=new int[n+1];
		for(int i=0;i<n;i++) {
			int num=arr[i];
			temp[num]++;
		}
		for(int i=1;i<n;i++) {
			if(temp[i]>1) {
				al.add(i);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of Array:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[] =new int[num];
		System.out.println("Enter Element:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> result=duplicate(arr);
		
		System.out.println("Duplicate Elements:"+result);
	}
}