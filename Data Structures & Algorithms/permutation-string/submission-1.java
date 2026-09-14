class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        char[] sort1 = s1.toCharArray();
        Arrays.sort(sort1);
        for(int i=0;i<s2.length()-k+1;i++){
           String sub = s2.substring(i, i+k);
           char[] sort2 = sub.toCharArray();
           Arrays.sort(sort2);
           if(Arrays.equals(sort1, sort2)){
            return true;
           }
        }
        return false;
    }
}
