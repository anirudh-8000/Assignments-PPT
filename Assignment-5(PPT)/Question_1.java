package Assignment_5_PPT;

import java.util.Scanner;

public class Question_1 {
	public static int[][] convert(int [] arr,int row ,int col){
		int [][]ans=new int [row][col];
		if(row * col != arr.length) {
			return new int[0][0];
		}
		for(int i=0;i<arr.length;i++) {
			int m = i / col;  // Calculate the row index
            int n = i % col;  // Calculate the column index
            ans[m][n] = arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Element:");
		int[] arr=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the row and column of 2d matrix:");
		int row=sc.nextInt();
		int col=sc.nextInt();
        int [][]result=convert(arr,row,col);
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		System.out.print(result[i][j]+"  ");
        	}
        	System.out.println();
        }
        sc.close();
	}

}
