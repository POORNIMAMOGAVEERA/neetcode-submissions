class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split("\\s+");
        String result = str[str.length-1];
        return result.length();
    }
}