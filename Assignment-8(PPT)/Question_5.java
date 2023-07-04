package Assignment_8_PPT;
public class Question_5 {
    public int compress(char[] chars) {
        return compressRecursive(chars, 0, 0);
    }
    
    private int compressRecursive(char[] chars, int index, int writeIndex) {
        if (index >= chars.length) {
            return writeIndex;
        }
        
        char currentChar = chars[index];
        int count = 1;
        
        while (index + 1 < chars.length && chars[index + 1] == currentChar) {
            count++;
            index++;
        }
        
        chars[writeIndex++] = currentChar;
        
        if (count > 1) {
            String countStr = String.valueOf(count);
            
            for (char c : countStr.toCharArray()) {
                chars[writeIndex++] = c;
            }
        }
        
        return compressRecursive(chars, index + 1, writeIndex);
    }
    
    public static void main(String[] args) {
    	Question_5 solution = new Question_5();
        
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = solution.compress(chars);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
