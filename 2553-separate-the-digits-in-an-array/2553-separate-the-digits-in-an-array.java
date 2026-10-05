class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<nums.length;i++){
            ans.append(nums[i]);
        }
        int out[]=new int[ans.length()];
       for(int i=0;i<ans.length();i++){
        out[i]=ans.charAt(i)-'0';
       }
        return out;
        
        
    }
}