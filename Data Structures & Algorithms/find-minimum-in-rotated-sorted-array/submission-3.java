class Solution {
    public int findMin(int[] nums) {
     //Brute Force

     int min=Integer.MAX_VALUE;
     for(int num: nums){
      min=Math.min(num, min);
     }
     return min;
    }
}
