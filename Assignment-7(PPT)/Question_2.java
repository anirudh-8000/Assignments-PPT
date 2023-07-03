package Assignment_7_PPT;

import java.util.Scanner;

public class Question_2 {
	
	public static boolean isStrobogrammatic(String n){
		int len=n.length();
		for(int i=0;i<(len/2)+1;i++){
			if(n.charAt(i)==48||n.charAt(i)==49||n.charAt(i)==56){
				if(n.charAt(i)!=n.charAt(len-i-1)){
					System.out.println("1  "+i+"  "+n.charAt(i) );
					return false;
				}
			}
			else if(n.charAt(i)==54){
				if(57!=n.charAt(len-i-1)){
					System.out.println("2  "+i+"  "+n.charAt(i) );
					return false;
				}
		    }
			else if(n.charAt(i)==57){
				if(54!=n.charAt(len-i-1)){
					System.out.println("3  "+i+"  "+n.charAt(i) );
					return false;
				}
			}
			else{
				System.out.println("4  "+i+"  "+n.charAt(i) );
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First String:");
	String first=sc.next();
	boolean ans=isStrobogrammatic(first);
	System.out.println(ans);
	sc.close();
	}

}
