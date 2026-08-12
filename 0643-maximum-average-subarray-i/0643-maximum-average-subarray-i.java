class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double window=0;
        for(int i=0;i<k;i++){
            window+=nums[i];
        }
        double maxsum=window;
        for(int i=k;i<nums.length;i++){
            window+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,window);

        }
        return maxsum/k;
        
    }
}