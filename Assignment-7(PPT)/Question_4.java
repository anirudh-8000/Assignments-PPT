package Assignment_7_PPT;
import java.util.*;

public class Question_4 {
	
	private static String reverse_each_character(String input) {
		String ans="";
		String[] arr=input.split(" ");
		for(String ele:arr) {
			for(int i=ele.length()-1;i>=0;i--) {
				ans=ans+ele.charAt(i);
			}
			ans+=" ";
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		System.out.println(reverse_each_character(input));
		sc.close();
	}

}
