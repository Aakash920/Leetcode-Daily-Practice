class Solution {
    public int maxProfit(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            max=Math.max(max,arr[i]-min);
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        if(max<0) return 0;
        return max; 
    }
}