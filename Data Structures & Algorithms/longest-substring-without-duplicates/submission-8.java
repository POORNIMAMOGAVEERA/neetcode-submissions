class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")){
            return 1;
        }
        Map<Character, Integer> map= new HashMap<>();
        int max=0, left=0, right=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))>=left){        
              max = max>(right-left)?max:(right-left);
              left=map.get(s.charAt(right))+1;
            }
            map.put(s.charAt(right),right);
            right++;
        }
        max = max>(right-left)?max:(right-left);
        return max;
    }
}
