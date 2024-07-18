package Arrays.Easy;

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        while(j<nums.length && nums[j]!=0){
            j++;
        }
        if(j>=nums.length-1){
            return;
        }
        
        int i=j+1;
        
        while(i<nums.length){
            if(nums[i]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}