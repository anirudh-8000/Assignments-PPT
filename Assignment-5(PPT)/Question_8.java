package Assignment_5_PPT; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_8 {

	static int[] res;
    static int index=0;
    public static int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1) return new int[0];
        res = new int[changed.length/2];
        
        int max = 0;
        for(int num: changed) max = Math.max(max, num);
        int[] nums = new int[max+1];
        for(int num: changed) nums[num]++;
        
        if(nums[0]%2==1) return new int[0];
        fill(0, nums[0]/2);
        
        for(int i=1; i<=max/2; i++){
            if(nums[2*i] < nums[i]) return new int[0];
            nums[2*i] -= nums[i];
            fill(i, nums[i]);
        }
        return index != res.length ? new int[0] : res;
    }
    
    private static void fill(int num, int count){
        while(count-->0)
            res[index++] = num;
    }


    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
