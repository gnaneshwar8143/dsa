class Solution {
    public int countConsistentStrings(String a, String[] w) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            
            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch,count+1);
            }else{
            map.put(ch,1);
            }

        }
        int count1=0;
        
        for(int i=0;i<w.length;i++){
            String word=w[i];
            boolean f=true;
            for(int j=0;j<word.length();j++){
                char c=word.charAt(j);
                if(!map.containsKey(c)){
                    f=false;
                    break;
                }
            }
            if(f){
                count1++;

            }
        }
        return count1;
        
    }
}