class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums) {
       
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            
            while(!stack.isEmpty()&&stack.peek()<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(nums[i]);
        }
       int output[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums1[i]==nums[j]){
                output[i]=ans[j];
                break;
            }

        }
       }
       return output;
    
            
    }
}