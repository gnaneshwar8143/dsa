class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int [nums.length];
        int i=0;
        int j=n;
        for(int k=0;k<n;k++){
            ans[i]=nums[k];
            i++;
            ans[i]=nums[j];
            j++;
            i++;

        }
        return ans;
    }
}