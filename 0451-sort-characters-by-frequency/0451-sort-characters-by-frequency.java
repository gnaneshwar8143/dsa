class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
          if(map.containsKey(s.charAt(i))){
            int count=map.get(s.charAt(i));
            map.put(s.charAt(i),count+1);
          }
          else{
            map.put(s.charAt(i),1);
          }
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char num:map.keySet()){
            pq.add(num);
        }
        StringBuilder ans= new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            int count=map.get(ch);
            for(int i=0;i<count;i++){
                ans.append(ch);
            }
        }
        return ans.toString();

        
    }
}