class Solution {
    public int numJewelsInStones(String j, String s) {
    HashSet<Character>set=new HashSet<>();
        int c=0;
        for(int i=0;i<j.length();i++){
            char ch=j.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                c++;
            }
        }
        return c;
        
    }
}