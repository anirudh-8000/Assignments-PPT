package Assignment_4_PPT;
import java.util.*;

public class Question_3 {
	public static void transpose(int [][]matrix) {
		int n=matrix.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][] matrix=new int[n][n];
		System.out.println("Enter the Element:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		transpose(matrix);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
