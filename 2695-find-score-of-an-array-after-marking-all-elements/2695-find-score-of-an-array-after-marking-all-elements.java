class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        HashSet<Integer> set=new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            minHeap.offer(new int[]{nums[i],i});
        }

        long score=0;
        while(!minHeap.isEmpty()){
            int[] curr=minHeap.poll();
            int val=curr[0];
            int idx=curr[1];

            if(!set.contains(idx)){
                score+=val;
                set.add(idx);
                set.add(idx-1);
                set.add(idx+1);
            }
        }
        return score;
    }
}