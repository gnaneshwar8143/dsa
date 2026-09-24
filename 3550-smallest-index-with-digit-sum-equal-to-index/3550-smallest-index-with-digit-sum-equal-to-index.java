class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int sum=0;
                int temp = nums[i];
                while(temp!=0){
                    int digit=temp%10;
                    sum+=digit;
                    temp/=10;

                }
                if(sum==i){
                    min=Math.min(min,i);
                }
               
            }
            else{
                if(nums[i]==i){
                    min=Math.min(min,i);
                }
                
             
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
        
    }
}