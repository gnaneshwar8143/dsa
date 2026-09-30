class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>= 0;i--){
            if(nums[i]<n){
                return true;
            }
            while(!st.isEmpty()&&nums[i]>st.peek()){
                n=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
        
    }
}