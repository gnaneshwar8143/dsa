class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums) {
       
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
      
        for(int i=nums.length-1;i>=0;i--){
            
            while(!stack.isEmpty()&&stack.peek()<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
               map.put(nums[i],-1);
            }
            else{
                map.put(nums[i],stack.peek());
            }
            stack.push(nums[i]);
        }
       int output[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        output[i]=map.get(nums1[i]);
        

        
       }
       return output;
    
            
    }
}