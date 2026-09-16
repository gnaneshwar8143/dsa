class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int max=1;
        int count=1;
        if(nums.length<1){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            if(nums[i]-nums[j]==1){
                
                count++;
                j++;
            }
            else{
                count=1;
                j++;
            }
            max=Math.max(max,count);
        }
        return max;
        
    }
}