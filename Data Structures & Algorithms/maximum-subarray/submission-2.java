class Solution {
    public int maxSubArray(int[] nums) {
       int currmax = 0, max= Integer.MIN_VALUE;
       for(int num: nums){
          currmax += num;
          currmax = Math.max(currmax, num);
          max = Math.max(currmax, max);
       }

       return max;
    }
}
