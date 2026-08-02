class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        
        dp = []
        dp.append(nums[0])
        dp.append(max(nums[0],nums[1]))
        
        i = 2
        for num in nums[2:]:
            dp.append(max(num+dp[i-2], dp[i-1]))
            i+=1
        return dp[-1]