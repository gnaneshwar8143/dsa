class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            
            for(int j=0;j<word.length();j++){
                char c=word.charAt(j);
                if(c==x){
                    list.add(i);
                    break;
                }
            
            }
        }
        return list;
        
    }
}