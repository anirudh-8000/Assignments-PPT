package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question_2{
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;
                int targetSum = target - (nums[i] + nums[j]);

                while (left < right) {
                    int currentSum = nums[left] + nums[right];

                    if (currentSum == targetSum) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (currentSum < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Element:");
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target Element:");
		int target=sc.nextInt();
        List<List<Integer>> result = fourSum(arr, target);

        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
