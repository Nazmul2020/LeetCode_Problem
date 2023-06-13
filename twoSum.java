import java.util.HashMap;
import java.util.Map;

class Solution{
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        Map<Integer,Integer>numMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            int check = target-nums[i];
            if(numMap.containsKey(check) && numMap.get(check)!=i){
                return new int[]{numMap.get(check),i};
            }
        }
        return new int[]{};
    }

    public int[] twoSum1(int[] nums, int target){
        Map<Integer,Integer>numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int check = target-nums[i];
            if(numMap.containsKey(check))
                return new int[]{numMap.get(check),i};
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }

}
public class LeetCode {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,3,5,6,7,4,8,9,10,11,45,34};
        int target = 50;
        int[] num = solution.twoSum(a,target);
        System.out.println(num[0]+" "+num[1]);

        num = solution.twoSum1(a,target);
        System.out.println(num[0]+" "+num[1]);


    }
}
