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
        if(mountainArr.length()<3) return -1;
        int idx=peak(mountainArr);
        System.out.println(idx);
        int ans=bs(target, 0, idx, mountainArr);
        if(ans!=-1) return ans;
        else{
            ans=bs(target, idx+1, mountainArr.length()-1, mountainArr);
        }
    return ans;
    }
    public int peak(MountainArray mountainArr){
        int s=0, e=mountainArr.length()-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                s=mid+1;
            }else if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                e=mid;
            }
        }
        return s;
    }
    public int bs(int target,int s, int e, MountainArray mountainArr){
        boolean isAsc=mountainArr.get(s)<mountainArr.get(e);

        while(s<=e){
            int mid=s+(e-s)/2;
            // For Ascending Order
            if(isAsc){
                if(target<mountainArr.get(mid)){
                e=mid-1;
            }else if(target>mountainArr.get(mid)){
                s=mid+1;
            }else{
                return mid;
            }
            }else{
                // For Desecding Order
                if(target>mountainArr.get(mid)){
                e=mid-1;
                }else if(target<mountainArr.get(mid)){
                    s=mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}