class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int len=0;
        while(temp>0){
            len++;
            temp/=10;
        }
        int sum=0;
        while(n>0){
            int digit=n%10;
            if(len%2==0){
                sum-=digit;
            }
            else{
                sum+=digit;
            }
            len--;
            n/=10;
        }
        return sum;
        
    }
}