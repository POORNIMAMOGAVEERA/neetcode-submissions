class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        unique = set(nums)
        max_result=0
        for num in unique:
          if num-1 not in unique:
            count = 1
            current = num
            while current+1 in unique:
              count+=1
              current+=1;
            max_result = max(count, max_result)
        return max_result