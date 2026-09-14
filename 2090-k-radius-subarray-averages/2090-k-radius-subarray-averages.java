class Solution {
    public int[] getAverages(int[] nums, int k) {
        int ans[]=new int[nums.length];
        int window=2*k+1;
        Arrays.fill(ans,-1);
        if(window > nums.length) {
    return ans;
}
        long sum=0;
        for(int i=0;i<window;i++){
            sum+=nums[i];
        }
        ans[k]=(int)(sum/window);
        for(int i=window;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-window];
            int middle=i-k;
            ans[middle]=(int)(sum/window);

        }
        return ans;
        
    }
}