class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int x:nums) {
            max=Math.max(max,x);
            sum+=x;
        }

        int s=max;
        int e=sum;

        // System.out.println(max+" "+sum);
        
        while(s<e){
            int currSum=0, count=1;
            int mid=s+(e-s)/2;
            for(int i=0 ; i<nums.length ; i++){
                if(currSum+nums[i]>mid){
                    count++;
                    //if my currSum is Greater than mid then we make
                    // addition in new aaray & for that change the currSum.
                    currSum=nums[i];
                    
                }else{
                    currSum+=nums[i];
                }
            }
            if(count>k){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return e;
    }
}