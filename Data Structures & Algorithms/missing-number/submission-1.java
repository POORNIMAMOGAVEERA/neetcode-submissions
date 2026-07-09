class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
          if(count!=nums[i]){
            return count;
          }
          count++;
        }
        return count;
    }
}
