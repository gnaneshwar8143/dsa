class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        int count=0;
        int avg=0;
        avg=windowsum/k;
        if(avg>=threshold){
            count++;
        }
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i]-nums[i-k];
            avg=windowsum/k;
            if(avg>=threshold){
                count++;
            }

        }
        return count;
        
    }
}