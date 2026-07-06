class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.merge(s.charAt(i), 1, Integer:: sum);
        }
        int result = 0;
        boolean hasOdd = false;
        for(Map.Entry<Character, Integer> ele: map.entrySet()){
            if((ele.getValue())%2==0){
                result += ele.getValue();
            }else{
                result += ele.getValue()-1;
                hasOdd = true;
            } 
        }
        if(hasOdd){
          return result+1;
        }
       return result; 
    }
}