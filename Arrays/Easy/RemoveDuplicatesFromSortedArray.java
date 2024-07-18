package Arrays.Easy;

class Solution {
    public int removeDuplicates(int[] nums) {
        int id=1;
        
        int x=nums[0];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x){
                
            }else{
                nums[id]=nums[i];
                id++;
                x=nums[i];
            }
        }
        
        return id;
    }
}
