class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }

        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<st.size();i++){
            ans.append(st.get(i));
        }
        return ans.toString();

        
    }
}