class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;    
    }

    public void backtrack(int[] nums, int remain, int start, List<Integer> curr, List<List<Integer>> result){
        if(remain==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(remain<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums, remain-nums[i], i, curr, result);
            curr.remove(curr.size()-1);
        }
    }
}
