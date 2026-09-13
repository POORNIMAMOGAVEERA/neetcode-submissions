class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()<=1) return s.length(); 
       Set<Character> set = new HashSet<>();
        int max = 0, left = 0;
       for(int right=0;right<s.length();right++){
          if(set.contains(s.charAt(right))){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
          }
          set.add(s.charAt(right));
          max = Math.max(max, set.size());         
       }
       return  max;
    }
}
