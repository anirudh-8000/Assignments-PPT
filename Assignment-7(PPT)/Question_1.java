package Assignment_7_PPT;

import java.util.Scanner;

public class Question_1 {
	public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n=s.length();
        int a[]=new int[256];
        int a2[]=new int[256];
        for(int i=0;i<n;i++){
           if(a[s.charAt(i)]!=a2[t.charAt(i)]){
               return false;
           }
            a[s.charAt(i)]=i+1;
            a2[t.charAt(i)]=i+1;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String:");
		String first=sc.next();
		System.out.println("Enter the Second String:");
		String second=sc.next();
		System.out.println(isIsomorphic(first,second));
		sc.close();
	}

}
