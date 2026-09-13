class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=nums.length+1;
        int l=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-l+1);
                sum-=nums[l];
                l++;
            }
            
        }
        if(min==nums.length+1){
            return 0;
        }else{

        
        return min;
        }
        
    }
}