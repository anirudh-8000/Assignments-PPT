package Assignment_7_PPT;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		System.out.println("Enter the another String:");
		String t=sc.next();
        System.out.println(compare(s,t));
        sc.close();

	}

	private static boolean compare(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)=='#') {
				i--;
				break;
			}
			if(s.charAt(i)!=t.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
