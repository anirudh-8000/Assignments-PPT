package Assignment_6_PPT;
import java.util.*;

public class Question_2 {
	public static boolean search(int [][]matrix,int target) {
	
		int m=matrix.length;
        int n=matrix[0].length;
        int index=0;
        for(int i=0;i<m;i++){
            if(matrix[i][n-1]>=target){
                index=i;
                break;
            }
        }
                int first=0,last=n-1;
                while(first<=last){
                int mid=(first+last)/2;
                if(matrix[index][mid]==target){
                    return true;
                }
                else if(matrix[index][mid]<target){
                    first=mid+1;
                }
                else{
                    last=mid-1;
                }
                }
        return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of matrix:");
		int m=sc.nextInt();
		System.out.println("Enter the column of matrix:");
		int n=sc.nextInt();
		int matrix[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the search element:");
		int target=sc.nextInt();
		boolean result=search(matrix,target);
		System.out.println(result);
		sc.close();
	}

}
