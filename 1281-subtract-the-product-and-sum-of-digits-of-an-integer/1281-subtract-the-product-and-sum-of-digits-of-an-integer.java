class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n!=0){
            int num=n%10;
            p*=num;
            s+=num;
            n/=10;

        }
        return p-s;
        
    }
}