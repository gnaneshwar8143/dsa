class Solution {
    public int finalValueAfterOperations(String[] s) {
        int count=0;
       
        for(int i=0;i<s.length;i++){
            String word=s[i];
            
                if(word.charAt(0)=='+'||word.charAt(1)=='+'){
                    count++;
                }
                else{
                    count--;
                }
            

        }
        return count;
        
    }
}