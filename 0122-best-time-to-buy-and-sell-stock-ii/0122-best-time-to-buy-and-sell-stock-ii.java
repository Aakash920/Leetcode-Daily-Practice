class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int buy=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]<arr[i-1]){
                buy=arr[i];
            }else{
                max+=arr[i]-arr[i-1];
            }
        }
        // if(max<0) return 0;
        return max; 
    }
}