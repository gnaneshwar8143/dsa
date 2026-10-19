class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int k=0;
            
            while(k<word.length()){
                if(word.charAt(k)==x){
                    list.add(i);
                    break;
                }
                k++;
            }
        }
        return list;
        
    }
}