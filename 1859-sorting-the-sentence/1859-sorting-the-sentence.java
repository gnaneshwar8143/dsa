class Solution {
    public String sortSentence(String s) {
        String[]arr=s.split(" ");
        String[]ans=new String[arr.length];
        for(int i=0;i<ans.length;i++){
            String word=arr[i];
            int position=word.charAt(word.length()-1)-'0';
            String actual=word.substring(0,word.length()-1);
            ans[position-1]=actual;
        }
        return String.join(" ",ans);
        
    }
}