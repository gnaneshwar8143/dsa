class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String n[]=s.split(" ");
        for(int i=0;i<n.length;i++){
            StringBuilder a=new StringBuilder(n[i]);
            a.reverse();
            ans.append(a);
            if(i<n.length-1){
                ans.append(" ");
            }
            
        }
        return ans.toString();
        
    }
}