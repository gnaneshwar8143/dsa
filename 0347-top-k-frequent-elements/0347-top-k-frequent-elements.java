class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
         PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
         for(int num:map.keySet()){
            pq.add(num);
         }
         int ans[]=new int[k];
         for(int i=0;i<k;i++){
            ans[i]=pq.poll();
         }
         return ans;

        
    }
}