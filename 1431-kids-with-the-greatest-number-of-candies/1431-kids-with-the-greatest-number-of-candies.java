class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {
        List<Boolean>list=new ArrayList<>();
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
           
          
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