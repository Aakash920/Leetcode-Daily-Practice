class Solution {
    int[] ans={-1,-1};
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return ans;
        bs1(nums, target);
        bs2(nums, target);
        return ans;
    }
    public void  bs1(int[] arr, int t){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(t<arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }

        if(e>=0 && e<arr.length && arr[e]==t){
            ans[1]=e;
        }
    }
    public void  bs2(int[] arr, int t){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(t>arr[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        if(s>=0 && s<arr.length && arr[s]==t){
            ans[0]=s;
        }
}
}