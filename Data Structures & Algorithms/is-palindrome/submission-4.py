class Solution:
    def isPalindrome(self, s: str) -> bool:
        # cleaned = ""

        # for c in s:
        #     if c.isalnum():
        #         cleaned+=c.lower()
        # return cleaned==cleaned[::-1]

        s = ''.join(ch.lower() for ch in s if ch.isalnum())
        return s == s[::-1]
