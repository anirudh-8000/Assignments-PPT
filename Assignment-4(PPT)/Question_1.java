package Assignment_4_PPT;
import java.util.*;

public class Question_1 {
	public static  ArrayList<Integer> commmon_element(int []arr1,int []arr2,int [] arr3) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if((int)arr1[i]==arr2[j]) {
				al.add(arr1[i]);	
				i++;
				j++;
				
			}
			else if((int)arr1[i]<arr2[j])
				i++;
			else
				j++;
		}
		i=0;
		j=0;
		while(i<al.size() && j<arr3.length) {
			if((int)al.get(i)==arr3[j]) {
				al2.add(arr3[j]);
				i++;
				j++;
					
			}
			else if((int)al.get(i)<arr3[j])
				i++;
			else
				j++;
		}
		return al2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		System.out.println("Enter the First Array Element:");
		int[] arr1=new int[n]; 
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Second Array Element:");
		int[] arr2=new int[n]; 
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter the Third Array Element:");
		int[] arr3=new int[n]; 
		for(int i=0;i<n;i++) {
			arr3[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=commmon_element(arr1,arr2,arr3);
		System.out.println("Common Element:"+ans);		
		sc.close();
	}

}
