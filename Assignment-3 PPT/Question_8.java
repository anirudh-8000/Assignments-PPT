package practice;
import java.util.*;

public class Question_8 {
	public static boolean solve(int[][]arr) {
		//Arrays.sort(arr);
		int end=arr[0][1];
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int start=arr[i][0];
			if(end<=start) {
				end=arr[i][1];
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of meetings:");
		int num=sc.nextInt();
		int[][]arr=new int[num][2]; 
		System.out.println("Enter the timing of meetings:");
		for(int i=0;i<num;i++) {
			arr[i][0]=sc.nextInt();
		    arr[i][1]=sc.nextInt();
		}
		boolean ans=solve(arr);
		System.out.println(ans);

	}

}
