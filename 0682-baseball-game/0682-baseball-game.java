class Solution {
    public int calPoints(String[] o) {
        Stack<Integer>st=new Stack<>();
       
        for(int i=0;i<o.length;i++){
           if(o[i].equals("C")){
            st.pop();

           }
           else if(o[i].equals("D")){
            st.push(2*st.peek());

           }
           else if(o[i].equals("+")){
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);

           }
           else{
            int num=Integer.parseInt(o[i]);
            st.push(num);
           }
        }int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
       
        return sum;
        
    }
}