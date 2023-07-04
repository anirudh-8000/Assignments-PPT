package Assignment_8_PPT;

public class Question_7 {
    private int index; // Global index variable
    
    public String decodeString(String s) {
        index = 0; // Initialize the index to 0
        return decodeStringRecursive(s);
    }
    
    private String decodeStringRecursive(String s) {
        StringBuilder result = new StringBuilder();
        
        while (index < s.length() && s.charAt(index) != ']') {
            if (Character.isDigit(s.charAt(index))) {
                int k = getNumber(s); // Get the number k
                index++; // Move past the opening bracket '['
                String subString = decodeStringRecursive(s); // Decode the substring inside the brackets
                index++; // Move past the closing bracket ']'
                
                // Repeat the substring k times and append it to the result
                for (int i = 0; i < k; i++) {
                    result.append(subString);
                }
            } else {
                result.append(s.charAt(index));
                index++;
            }
        }
        
        return result.toString();
    }
    
    private int getNumber(String s) {
        int number = 0;
        
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            number = number * 10 + (s.charAt(index) - '0');
            index++;
        }
        
        return number;
    }
    
    public static void main(String[] args) {
    	Question_7 solution = new Question_7();
        
        // Test case
        String s = "3[a]2[bc]";
        String decodedString = solution.decodeString(s);
        
        System.out.println("Decoded String: " + decodedString);
    }
}

