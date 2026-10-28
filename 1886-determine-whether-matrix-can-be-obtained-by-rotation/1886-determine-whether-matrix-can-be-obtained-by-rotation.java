class Solution {
    public boolean findRotation(int[][] m, int[][] t) {
        int n=m.length;
        int s=t.length;
        int i=0;
       while(i!=4){
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int temp=m[j][k];
                    m[j][k]=m[k][j];
                    m[k][j]=temp;
                }
            }
            for(int a=0;a<n;a++){
                int left=0;
                int right=n-1;
                while(left<right){
                    int temp=m[a][left];
                    m[a][left]=m[a][right];
                    m[a][right]=temp;
                    left++;
                    right--;
                }
            }
            if(Arrays.deepEquals(m,t)){
                return true;
            }
            else{
                i++;
            }
       }
       return false;
        
        
    }
}