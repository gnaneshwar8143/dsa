class Solution {
    public int[] getAverages(int[] nums, int k) {
        int ans[]=new int[nums.length];
        int windowsize=2*k+1;
        Arrays.fill(ans,-1);
        if(windowsize>nums.length){
            return ans;
        }
        long sum=0;
        for(int i=0;i<windowsize;i++){
            sum+=nums[i];

        }
        ans[k]=(int)(sum/windowsize);
        for(int i=windowsize;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-windowsize];
            int middle=i-k;
            ans[middle]=(int)(sum/windowsize);
        }
        return ans;
    }
}