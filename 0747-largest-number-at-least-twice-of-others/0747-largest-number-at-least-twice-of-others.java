class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=maxIndex&&max<nums[i]*2){
                return -1;
            }
           
        }
        return maxIndex;
        
    }
}