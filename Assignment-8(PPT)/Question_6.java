package Assignment_8_PPT;

import java.util.ArrayList;
import java.util.List;

public class Question_6 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        
        if (sLen < pLen) {
            return indices;
        }
        
        int[] targetFreq = getCharacterFrequency(p);
        
        findAnagramsRecursive(s, targetFreq, indices, pLen, 0);
        
        return indices;
    }
    
    private void findAnagramsRecursive(String s, int[] targetFreq, List<Integer> indices, int pLen, int index) {
        if (index >= s.length()) {
            return;
        }
        
        int[] windowFreq = getCharacterFrequency(s.substring(index, index + pLen));
        
        if (isAnagram(windowFreq, targetFreq)) {
            indices.add(index);
        }
        
        findAnagramsRecursive(s, targetFreq, indices, pLen, index + 1);
    }
    
    private int[] getCharacterFrequency(String str) {
        int[] freq = new int[26];
        
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        
        return freq;
    }
    
    private boolean isAnagram(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
    	Question_6 solution = new Question_6();
        
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = solution.findAnagrams(s, p);
        
        System.out.println("Anagram Indices: " + indices);
    }
}
