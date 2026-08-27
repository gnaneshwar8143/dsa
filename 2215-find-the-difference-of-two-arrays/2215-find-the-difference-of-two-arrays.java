class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        List<List<Integer>>main=new ArrayList<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
         for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int num:set1){
            if(!set2.contains(num)){
                list.add(num);
            }
        }
        main.add(list);
        for(int num:set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }
        main.add(list2);
        return main;

        
    }
}