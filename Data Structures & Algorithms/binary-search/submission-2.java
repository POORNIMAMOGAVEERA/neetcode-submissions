class Solution {
    public int search(int[] nums, int target) {
        // int left = 0, right = nums.length-1;
        // while(left<=right){
        //   int mid = (left+right)/2;
        //   if(nums[mid]<target){
        //     left = mid+1;
        //   }else if(nums[mid]>target){
        //     right= mid-1;
        //   }else{
        //     return mid;
        //   }
        // }
        // return -1;
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private int binarySearch(int[] nums, int target, int left, int right){
      if(left > right) return -1;

      int mid = (left+right)/2;
      if(nums[mid]>target){
        return binarySearch(nums, target, left, mid-1);
      }
      else if(nums[mid]<target){
        return binarySearch(nums, target, mid+1, right);
      }
      else{
        return mid;
      }
    }
}
