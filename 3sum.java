import java.util.*;

class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        Map<Integer,Integer>numMap = new HashMap<>();
        List<List<Integer>>listOfList = new ArrayList<>();
        Set<List<Integer>>setOfList = new HashSet<>();


        int n = nums.length;
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i],i);
        }
        int i = 0,check;
        while(i<n-1){
                int j=i+1;
                while (j<n){
                    check =  nums[i]+nums[j];
                    check=check-2*check; // for reversing the number
                    if(numMap.containsKey(check) && numMap.get(check)!=i && numMap.get(check)!= j){
                       List<Integer> list = new ArrayList<>();
                        int[] intValue = new int[3];

                        intValue[0]=nums[i];
                        intValue[1]=nums[j];
                        intValue[2]=nums[numMap.get(check)];
                        Arrays.sort(intValue);

                        list.add(intValue[0]);
                        list.add(intValue[1]);
                        list.add(intValue[2]);

                        setOfList.add(list);

                    }
                    j++;
                }
                i++;

        }
        listOfList.addAll(setOfList);
        return listOfList;
    }

}
public class LeetCode {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(a));




    }
}
