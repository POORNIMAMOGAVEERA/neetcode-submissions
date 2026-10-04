class Solution {
    public int findMin(int[] nums) {
     //Brute Force
     //T.c - O(n)
     //S.c - O(1)
    //  int min=Integer.MAX_VALUE;
    //  for(int num: nums){
    //   min=Math.min(num, min);
    //  }
    //  return min;

     int min   = Integer.MAX_VALUE;
     int left = 0, right = nums.length-1;
     
      while(left<=right){
         if(nums[left]<nums[right]){
          return Math.min(min, nums[left]);
      }
        int mid = left+(right-left)/2;
        min = Math.min(min, nums[mid]);
        if(nums[mid]>=nums[left]){
          left = mid+1;
        }else{
          right = mid-1;
        }
     }
     return min;
    }
}
