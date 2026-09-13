class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();  
      Arrays.sort(nums);
      for(int k = 0; k<nums.length-2; k++){
         int left = k+1, right = nums.length-1;
         if(k>0 && nums[k]==nums[k-1]) continue;
         while(left<right){
            int sum = nums[left]+nums[right];
            if(-(nums[k]) == sum){
              List<Integer> list = Arrays.asList(nums[k], nums[left], nums[right]);
              result.add(list);
              while(left<right && nums[left]==nums[left+1]){
                left++;
              }
              while(left<right && nums[right]==nums[right-1]){
                right--;
              }
              left++;
              right--;
            }else if(-(nums[k]) > sum){
              left++;
            }else{
                right--;
            }
         }
    }
     return new ArrayList<>(result);
      }
}