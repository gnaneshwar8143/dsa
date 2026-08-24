class Solution {
    public int findMin(int[] nums) {
       int min=Integer.MAX_VALUE;
       
       for(int j=0;j<nums.length;j++){
       
            min=Math.min(min,nums[j]);
           
       
       }
       return min;
        
    }
}