class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {
        List<Boolean>list=new ArrayList<>();
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
              
            }
          
        }
        for(int i=0;i<nums.length;i++){
            if((nums[i]+e )>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }

        }
        return list;
        
    }
}