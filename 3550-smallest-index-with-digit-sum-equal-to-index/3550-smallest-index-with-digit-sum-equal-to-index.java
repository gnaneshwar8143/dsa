class Solution {
    public int smallestIndex(int[] nums) {
    
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
                    return i;
                }
               
            }
            else{
                if(nums[i]==i){
                  return i;
                }
                
             
            }
        }
        
        return -1;
        
    }
}