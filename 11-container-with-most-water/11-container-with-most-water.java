class Solution {
    public int maxArea(int[] height) {
//         int maxArea=0;
//         int maxi=0;
//         int fmax=0;
//         int smax=0;
//         int fmaxi=0;
//         int smaxi=0;
//         for(int i=0 ; i<height.length ; i++){
//             if(height[i]>fmax){
//                 smax=fmax;
//                 smaxi=fmaxi;
//                 fmax=height[i];
//                 fmaxi=i;
//             } else if (height[i] > smax ){
//                 smax = height[i];
//                 smaxi=i;
//             }
//             int b=Math.min(height[i],height[height.length-1]);
//             int area=b*(height.length-1-i);
//             maxArea=Math.max(area,maxArea);
//             maxArea=Math.max(maxArea,smax*Math.abs(fmaxi-smaxi));
//         }
        
        
//         return maxArea;
        
        int maxArea=0;
        int i=0, j=height.length-1;
        while(i<j){
            int area=0;
            if(height[i]<height[j]){
                area=height[i]*(j-i);
                if(area>maxArea){
                    maxArea=area;
                }else{
                    i++;
                }
            }else{
                area=height[j]*(j-i);
                if(area>maxArea){
                    maxArea=area;
                }else{
                    j--;
                }
            }
        }
        return maxArea;
    }
}