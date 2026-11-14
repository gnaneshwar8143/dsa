class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int s=0;
         for(int j=i;j<nums.size();j++){
            s+=nums.get(j);
            int length=j-i+1;
            if(length >=l && length<=r &&s>0){
                ans=Math.min(ans,s);
            }

         }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
        

       
        
    }
}