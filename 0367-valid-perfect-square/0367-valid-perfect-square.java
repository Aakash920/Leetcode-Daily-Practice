class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=2) return true;
        long s=1, e=num/2;
        while(s<=e){
            long mid=s+(e-s)/2;
            long ans=mid*mid;
            if(ans==num) return true;
            if(ans<num){
                s=mid+1;
            }else if(ans>num){
                e=mid-1;
            }
        }
        return false;
    }
}