class Solution:
    def longestPalindrome(self, s: str) -> int:
      frequency = Counter(s)
      result = 0
      hasOdd = False
      for i in frequency.values():
        if i%2==0:
           result += i 
        else:
           result += i-1
           hasOdd = True

      if hasOdd:
        return result+1
      return result          