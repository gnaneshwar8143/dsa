class Solution {
    public String interpret(String s) {
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='G'){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='('||s.charAt(i)=='a'||s.charAt(i)=='l'){
                count++;
            }
            if(s.charAt(i)==')'&&count==1){
                ans.append('o');
                count=0;
            }
            if(s.charAt(i)==')'&&count==3){
                ans.append('a');
                ans.append('l');
                count=0;
            }
        }
        return ans.toString();
        
    }
}