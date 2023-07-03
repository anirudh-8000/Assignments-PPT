package Assignment_7_PPT;

import java.util.Scanner;

public class Question_5 {
	public static String reverse_k(String s,int k) {
		int n=s.length();
		StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i += 2*k) {
            int j = Math.min(i + k, n);
            StringBuilder rev = new StringBuilder(s.substring(i, j));
            rev.reverse();
            sb.append(rev);
            int rem = Math.min(i + 2*k, n);
            sb.append(s.substring(j, rem));
        }
        return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Enter the number:");
		int k=sc.nextInt();
		System.out.println(reverse_k(input,k));
		sc.close();
	}

}
