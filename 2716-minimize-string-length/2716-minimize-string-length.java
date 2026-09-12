class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character>set=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
         
        }
        int count=0;
        for(int i=0;i<set.size();i++){
            count++;
        }
        return count;
      

        
    }
}