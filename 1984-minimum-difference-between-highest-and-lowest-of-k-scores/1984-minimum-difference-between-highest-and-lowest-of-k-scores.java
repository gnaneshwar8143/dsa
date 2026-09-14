class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        if(nums.length==1){
            return 0;
        }
        int mindiff=0;
        int j=0;
        for(int i=k-1;i<nums.length;i++){
            mindiff=nums[i]-nums[j];
            min=Math.min(min,mindiff);
            j++;

        }
        return min;
        
    }
}