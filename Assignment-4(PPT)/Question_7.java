package Assignment_4_PPT;

import java.util.Scanner;

public class Question_7 {
	public static int solve(int[][] ops,int m,int n) {
		int num=ops.length;
	    int minRow = m;
	    int minCol = n;
	   
		for(int i=0;i<num;i++) {
			minRow = Math.min(minRow, ops[i][0]);
            minCol = Math.min(minCol, ops[i][1]);
		}
		return minRow*minCol;
	}

	public static void main(String[] args) {
		System.out.println("Enter the row and column of matrix:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the number of operations:");
        int num=sc.nextInt();
        int[][] ops=new int[num][2];
        System.out.println("Enter values:");
        for(int i=0;i<num;i++) {
        	ops[i][0]=sc.nextInt();
        	ops[i][1]=sc.nextInt();
        }
        int ans=solve(ops,m,n);
        System.out.println("The answer is: "+ans);
	}

}
