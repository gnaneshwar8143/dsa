/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int start=0;
        int end=n-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        int peak=start;
        int ans=binarysearchin(mountainArr,target,0,peak);
        if(ans!=-1){
            return ans;
        }
        return binarysearchde(mountainArr,target,peak+1,n-1);
    }
        public int binarysearchin(MountainArray arr,int target,int start,int end){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr.get(mid)==target){
                    return mid;
                }
                else if(arr.get(mid)<target){
                    start=mid+1;

                }
                else{
                    end=mid-1;
                }
            }
            return -1;
        }
        public int binarysearchde(MountainArray arr,int target,int start,int end){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr.get(mid)==target){
                    return mid;
                }
                else if(arr.get(mid)>target){
                    start=mid+1;

                }
                else{
                    end=mid-1;
                }
            }
            return -1;
        }
        
    }
