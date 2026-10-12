class Solution {
    public int maxProfit(int[] nums) {
       int pre=0;
       for( int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            pre+=nums[i]-nums[i-1];

        }
       }
       return pre;
        
    }
}