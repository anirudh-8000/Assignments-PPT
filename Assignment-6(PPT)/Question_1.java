package Assignment_6_PPT;
import java.util.*;

public class Question_1 {
	private static int[] solve(String s) {
		int n = s.length();
        int[] perm = new int[n + 1];

        int start = 0;
        int end = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = start++;
            } else {
                perm[i] = end--;
            }
        }
        perm[n] = start;

        return perm;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String input=sc.next();
		int n=input.length();
		int result[]=new int[n+1];
		result=solve(input);
		for(int i:result)
			System.out.println(i);
		sc.close();
		
	}
}