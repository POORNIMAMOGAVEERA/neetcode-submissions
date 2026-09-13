class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> result = new LinkedHashSet<>();  
      Arrays.sort(nums);
      for(int k = 0; k<nums.length-2; k++){
         int left = k+1, right = nums.length-1;
         while(left<right){
            int sum = nums[left]+nums[right];
            if(-(nums[k]) == sum){
              List<Integer> list = Arrays.asList(nums[k], nums[left], nums[right]);
              result.add(list);
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