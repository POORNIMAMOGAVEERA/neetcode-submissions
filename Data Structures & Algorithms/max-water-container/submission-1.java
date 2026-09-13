class Solution {
    public int maxArea(int[] heights) {
       int max = 0, left = 0, right = heights.length-1;
       while (left<right){
         int min_width = Math.min(heights[left], heights[right]);
         max = Math.max(min_width*(right-left), max);
         if(heights[left]>heights[right]){
            right--;
         }else{
            left++;
         }
       }
       return max;

    }
}
