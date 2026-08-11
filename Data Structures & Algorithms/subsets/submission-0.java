class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(0,nums, result, new ArrayList<>());
        return result;
    }

    public void dfs(int index,int[] nums, List<List<Integer>> result, List<Integer> list){
        if(index==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]); 
        dfs(index+1, nums, result, list);
        list.remove(list.size()-1);
        dfs(index+1, nums, result, list);

    }

}
