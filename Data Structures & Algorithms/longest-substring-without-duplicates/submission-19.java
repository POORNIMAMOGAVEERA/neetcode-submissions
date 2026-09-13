class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()<=1) return s.length(); 
       Set<Character> set = new HashSet<>();
        int max = 0, left = 0;
       for(Character c: s.toCharArray()){
          if(set.contains(c)){
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
          }
          set.add(c);
          max = Math.max(max, set.size());         
       }
       return  max;
    }
}
