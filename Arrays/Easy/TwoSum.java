package Arrays.Easy;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            
            if(hm.containsKey(diff)){
                ans[0] = hm.get(diff);
                ans[1] = i;
                return ans;
            }
            
            hm.put(nums[i],i);
        }
        
        return ans;
        
    }
}
