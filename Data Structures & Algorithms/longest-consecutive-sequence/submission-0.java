class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int longest =0;
        for(int h: hash){
            if(!hash.contains(h-1)){
                int current = h;
                int count = 1;
                
                while(hash.contains(current+1)){
                    current++;
                     count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
