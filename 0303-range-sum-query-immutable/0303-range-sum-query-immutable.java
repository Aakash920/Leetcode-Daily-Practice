class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr=new int[nums.length+1];
        
        int sum=0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            arr[i+1]=sum;
            // System.out.print(arr[i+1]+" ");
        }

    }
    
    public int sumRange(int left, int right) {
        left+=1;
        right+=1;
        return arr[right]-arr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */