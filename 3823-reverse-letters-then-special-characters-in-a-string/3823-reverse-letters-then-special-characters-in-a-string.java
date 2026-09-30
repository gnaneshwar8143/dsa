class Solution {
    public String reverseByType(String s) {
        char arr[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        
        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
            }
            else if(!Character.isLetter(arr[right])){
                right--;
            }
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(Character.isLetter(arr[start])){
                start++;
            }
            else if(Character.isLetter(arr[end])){
                end--;
            }
            else{
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(arr);


        
    }
}