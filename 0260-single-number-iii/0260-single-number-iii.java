class Solution {
    public int[] singleNumber(int[] nums) {
      
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer>list=new ArrayList<>();
     

        for( int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                list.add( nums[i]);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;

        

        
    }
}