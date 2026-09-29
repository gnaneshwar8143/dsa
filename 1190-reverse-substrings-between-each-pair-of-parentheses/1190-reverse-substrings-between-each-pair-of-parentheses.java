class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character>st=new Stack<>();
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(Character.isLetter(ch)){
                st.push(ch);
            }
            else if(ch==')'){
                StringBuilder ans=new StringBuilder();
                while(st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
                for(int j=0;j<ans.length();j++){
                    st.push(ans.charAt(j));
                }
            }
        
            
            
           
        

        }
            StringBuilder b= new StringBuilder();
            while(!st.isEmpty()){
                b.append(st.pop());
            }
            return b.reverse().toString();
    }
}