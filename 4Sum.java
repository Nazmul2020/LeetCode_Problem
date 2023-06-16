import java.util.*;

class Solution{
    public List<List<Integer>> fourSum(int[] nums, int target){
        Map<Long,Integer>numMap = new HashMap<>();
        List<List<Integer>>listOfList = new ArrayList<>();
        Set<List<Integer>>setOfList = new HashSet<>();


        int n = nums.length;
        for (int i = 0; i < n; i++) {
            numMap.put((long)nums[i],i);
        }
        int i = 0;
        long check;
        while(i<n-2){
            int j = i+1;
            while(j<n-1){
                int k=j+1;
                while (k<n){
                   long longValue = (long)nums[i]+(long)nums[j]+(long)nums[k];
                   check = (target-longValue);
                    if(numMap.containsKey(check) && numMap.get(check)!=i && numMap.get(check)!=j && numMap.get(check)!= k){
                        List<Integer> list = new ArrayList<>();
                        int[] intValue = new int[4];

                        intValue[0]=nums[i];
                        intValue[1]=nums[j];
                        intValue[2]=nums[k];
                        intValue[3]=nums[numMap.get(check)];
                        Arrays.sort(intValue);


                        list.add(intValue[0]);
                        list.add(intValue[1]);
                        list.add(intValue[2]);
                        list.add(intValue[3]);

                        setOfList.add(list);

                    }
                    k++;
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
        int[] a = {1,0,-1,0,-2,2};
        System.out.println(solution.fourSum(a,0));




    }
}
