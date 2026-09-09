class Solution {
    public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int start = 0, end = s.length()-1;
    while(start<end){
        char left = s.charAt(start);
        char right = s.charAt(end);
        if(left != right){
        return false;
        }
        start++;
        end--;
    }
    return true;
    }
}
