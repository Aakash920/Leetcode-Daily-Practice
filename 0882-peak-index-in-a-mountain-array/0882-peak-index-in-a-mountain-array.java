class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0, e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                // why we are not doing e=mid-1
                // coz we didn't know that the previous index has greater value or not
                // e.g- {1,2,5,6,4,3,2} so, suppose  we are at 3 but we don't know about that
                // before 3 that is 4 is greater or not.
                e=mid;
            }
        }
        return s;
    }
}