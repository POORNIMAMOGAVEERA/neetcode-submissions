class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currMax = 0
        max_value = float('-inf')

        for i in nums:
            currMax = max(i, currMax+i)
            max_value = max(currMax, max_value)
        
        return max_value