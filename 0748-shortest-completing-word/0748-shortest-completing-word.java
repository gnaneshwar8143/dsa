class Solution {
    public String shortestCompletingWord(String l, String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        int length=0;
        for(int i=0;i<l.length();i++){
            char ch = Character.toLowerCase(l.charAt(i));
            if(Character.isLetter(ch)){
            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch,count+1);
               length++;
            }
            else{
                map.put(ch,1);
                length++;
               
            }
            }
        }
        String ans="";
      
        for(int i=0;i<words.length;i++){
            String w=words[i];
            int remaining=length;
            HashMap<Character,Integer>ma=new HashMap<>(map);
            for(int j=0;j<w.length();j++){
              char c = Character.toLowerCase(w.charAt(j));
                
                
                if(ma.containsKey(c)&&ma.get(c)>0){
                    ma.put(c,ma.get(c)-1);
                    remaining--;
                }

            }
           if(remaining == 0) {

                if(ans.equals("") || w.length() < ans.length()) {
                    ans = w;
                }
            }

        }
        return ans;
        
    }
}