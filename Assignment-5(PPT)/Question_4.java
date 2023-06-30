package Assignment_5_PPT;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_4 {
	public static ArrayList<ArrayList<Integer>> unique_element(int[]arr1,int[]arr2){
		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if((int)arr1[i]==arr2[j]) {	
				i++;
				j++;
				
			}
			else if((int)arr1[i]<arr2[j]) {
				al.add(arr1[i]);
				i++;
			}
				
			else {
				al2.add(arr2[i]);
				j++;
			}
		}
		while(i<arr1.length ) {
			al.add(arr1[i]);
			i++;
		}
		while(j<arr2.length) {
			al2.add(arr2[j]);
			j++;
		}
		ans.add(al);
		ans.add(al2);
		return ans;
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
		ArrayList<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
        l=unique_element(arr1,arr2);
        System.out.println(l);
	}
}