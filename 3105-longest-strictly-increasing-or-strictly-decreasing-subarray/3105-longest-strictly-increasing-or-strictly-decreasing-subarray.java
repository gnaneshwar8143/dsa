class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxcount=1;
        int mincount=1;
        int result=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                maxcount++;
                mincount=1;
            }
            else if(nums[i]<nums[i+1]){
                maxcount=1;
                mincount++;
            }
            else{
                maxcount=1;
                mincount=1;
            }
            result=Math.max(result,Math.max(maxcount,mincount));

        }
        return result;
        
    }
}