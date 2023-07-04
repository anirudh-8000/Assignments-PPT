package Assignment_8_PPT;

import java.util.Stack;

public class Question_2 {
    public static boolean checkValidString(String s) {
        Stack<Integer> leftParenStack = new Stack<>();
        Stack<Integer> asteriskStack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                leftParenStack.push(i);
            } else if (c == '*') {
                asteriskStack.push(i);
            } else {
                if (!leftParenStack.isEmpty()) {
                    leftParenStack.pop();
                } else if (!asteriskStack.isEmpty()) {
                    asteriskStack.pop();
                } else {
                    return false;
                }
            }
        }
        
        while (!leftParenStack.isEmpty() && !asteriskStack.isEmpty()) {
            int leftIndex = leftParenStack.pop();
            int asteriskIndex = asteriskStack.pop();
            
            if (leftIndex > asteriskIndex) {
                return false;
            }
        }
        
        return leftParenStack.isEmpty();
    }
    
    public static void main(String[] args) {
       
        String s = "()";
        boolean result = checkValidString(s);
        System.out.println("Is the string valid? " + result);
    }
}
