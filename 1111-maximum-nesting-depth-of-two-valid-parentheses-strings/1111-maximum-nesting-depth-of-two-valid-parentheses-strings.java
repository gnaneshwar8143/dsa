class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans[]=new int[seq.length()];
        int count=0;
        for(int i=0;i<seq.length();i++){
            char ch= seq.charAt(i);
            if(ch=='('){
                ans[i]=++count%2;
            }
            else{
                ans[i]=count--%2;
            }
            
        }
        return ans;
        
    }
}