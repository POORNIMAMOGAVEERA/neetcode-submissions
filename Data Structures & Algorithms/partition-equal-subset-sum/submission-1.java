class Solution {
    Boolean memo[][];
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
          sum += num;
        }

        if(sum%2!=0) return false;
        sum /=2;
        memo = new Boolean[nums.length][sum+1];
        return dfs(nums, 0, sum);        
    }

    public boolean dfs(int[] nums,int index, int target){

        if(target == 0) return true;

        if(index== nums.length || target<0) return false;

        if(memo[index][target]!=null) return memo[index][target];

        boolean take = dfs(nums, index+1, target- nums[index]);

        boolean skip=  dfs(nums, index+1, target);

        memo[index][target] = take || skip;

        return  memo[index][target];
        
    }
}
