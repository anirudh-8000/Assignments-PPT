package Assignment_7_PPT;

import java.util.Scanner;

public class Question_3 {
	public static String addition(String a,String b) {
		int m=a.length()-1;
		int n=b.length()-1;
		StringBuilder result = new StringBuilder();
		int cy=0;
		while(m>=0&&n>=0) {
			int num=a.charAt(m)-48+b.charAt(n)-48+cy;
			if(num>9) {
				cy=1;
				num=num%10;
			}
			else {
				cy=0;
			}
			result.insert(0,num);
			m--;
			n--;
		}
		while(m>=0) {
			int num=a.charAt(m)-48+cy;
			if(num>9) {
				cy=1;
				num=num%10;
			}
			else {
				cy=0;
			}
			result.insert(0,num);
			m--;
		}
		while(n>=0) {
			int num=b.charAt(n)-48+cy;
			if(num>9) {
				cy=1;
				num=num%10;
			}
			else {
				cy=0;
			}
			result.insert(0,num);
			n--;
		}
		if (cy > 0) {
            result.insert(0, cy);
        }

        return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String:");
		String first=sc.next();
		System.out.println("Enter the Second String:");
		String second=sc.next();
		System.out.println(addition(first,second));
		sc.close();
	}
}
