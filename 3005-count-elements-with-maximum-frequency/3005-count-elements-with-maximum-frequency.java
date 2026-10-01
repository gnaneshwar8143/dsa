class Solution {
    public int maxFrequencyElements(int[] nums) {
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
        int nums1[]=new int[nums.length];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=nums[i];
        }

        Arrays.sort(nums1);
        int freq=1;
        int count=1;
        for(int i=0;i<nums1.length-1;i++){
            if(nums1[i]==nums1[i+1]){
                count++;
                
            }
            else{
                count=1;
            }
            freq=Math.max(freq,count);

        }
        int output=0;
        for(int v:map.values()){
            if(v==freq){
                output+=(v);
            }
        }
        return output;
        

        
        
        
    }
}