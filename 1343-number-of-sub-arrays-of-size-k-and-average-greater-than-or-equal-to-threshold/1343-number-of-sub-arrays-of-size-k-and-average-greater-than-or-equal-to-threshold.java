class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        int avg=windowsum/k;
        int count=0;

        if(avg>=threshold){
            count++;
        }
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i];
            windowsum-=nums[i-k];
            avg=windowsum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
        
    }
}