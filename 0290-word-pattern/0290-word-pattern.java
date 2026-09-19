class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String w=words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(w)){
                    return false;
                }
            }
            else{
                map.put(ch,w);
            }
            if(map2.containsKey(w)){
                if(map2.get(w)!=ch){
                    return false;
                }
            }
            else{
                map2.put(w,ch);
            }
        }
        return true;

        
    }
}