package Assignment_6_PPT;
import java.util.HashMap;
import java.util.Map;

public class Question_4 {
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, -1);  // Initialize with a dummy sum of 0 at index -1

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            if (prefixSum.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - prefixSum.get(sum));
            } else {
                prefixSum.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int result =findMaxLength(nums);
        System.out.println(result);  // Output: 2
    }
}
