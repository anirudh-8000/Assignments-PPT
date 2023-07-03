package Assignment_7_PPT;
import java.util.Scanner;
public class Question_6 {
	private static boolean solve(String s, String goal) {
		if(s.length()!=goal.length()) {
			return false;
		}
		int n=s.length();
		for(int i=0;i<n;i++) {
			StringBuilder sb=new StringBuilder();
	        sb.append(s.substring(i, n));
	        if(i>0) {
	        	sb.append(s.substring(0, i));
	        }
	        if(goal.equals(sb.toString()) ){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		System.out.println("Enter the goal String:");
		String goal=sc.next();
        System.out.println(solve(s,goal));
        sc.close();
	}
}