class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int total=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                total+=customers[i];
            }

        }
        int max=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                max+=customers[i];
            }
        }
        int maxq=max;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i]==1){
                maxq+=customers[i];
            }
            if(grumpy[i-minutes]==1){
            maxq-=customers[i-minutes];
            }
            max=Math.max(max,maxq);
        }
        return total+max;

        
    }
}