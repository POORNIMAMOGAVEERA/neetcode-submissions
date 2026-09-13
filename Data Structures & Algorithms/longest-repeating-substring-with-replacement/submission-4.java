class Solution {
    public int characterReplacement(String s, int k) {
      int left = 0, max=0, result = 0;
      int[] freq = new int[26];
      for(int right = 0; right<s.length(); right++){
         freq[s.charAt(right)-'A']++;
         max = Math.max(freq[s.charAt(right)-'A'], max);
          while((right-left+1)-max>k){
            freq[s.charAt(left)-'A']--;
            max = Math.max(freq[s.charAt(left)-'A'], max);
            left++;
          }
          result = Math.max(result, right-left+1);
      }
      return result;
    }
}