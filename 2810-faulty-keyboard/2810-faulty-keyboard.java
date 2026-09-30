class Solution {
    public String finalString(String s) {
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='i'){
                ans.reverse();
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
   
}