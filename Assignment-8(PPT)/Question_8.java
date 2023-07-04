package Assignment_8_PPT;
import java.util.*;

public class  Question_8 {
    public boolean canSwapString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        return canSwapStringRecursive(s.toCharArray(), goal.toCharArray(), 0, 0, false);
    }
    
    private boolean canSwapStringRecursive(char[] s, char[] goal, int index, int swapIndex, boolean hasSwapped) {
        if (index == s.length) {
            return hasSwapped && Arrays.equals(s, goal);
        }
        
        if (s[index] == goal[index]) {
            return canSwapStringRecursive(s, goal, index + 1, swapIndex, hasSwapped);
        }
        
        if (hasSwapped || swapIndex != -1) {
            return false;
        }
        
        for (int i = index + 1; i < s.length; i++) {
            if (s[i] == goal[index]) {
                swap(s, index, i);
                boolean canSwap = canSwapStringRecursive(s, goal, index + 1, i, true);
                swap(s, index, i); 
                if (canSwap) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
    	Question_8  solution = new Question_8 ();
        
        String s = "ab";
        String goal = "ba";
        boolean result = solution.canSwapString(s, goal);
        
        System.out.println("Can Swap: " + result);
    }
}
