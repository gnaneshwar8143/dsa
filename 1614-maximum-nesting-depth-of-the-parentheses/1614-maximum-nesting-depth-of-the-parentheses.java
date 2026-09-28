class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));

              
               
               
            }
            if(s.charAt(i)==')'){
                st.pop();
                max=Math.max(max,st.size());
            }
        
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max+1;
        
        
    }
}