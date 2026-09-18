class Solution {
    public int[] applyOperations(int[] nums) {
        
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
               
            }
            else{
                
                continue;
                
            }
        }
      
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=0){
                nums[j]=nums[k];
                j++;

            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;

        }
        return nums;

        
    }
}