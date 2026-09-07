class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();

       for(int num:nums){
        set.add(num);
       }
       int counter=0, max=0;
       for(Integer num: set){
          if(!set.contains(num-1)){
            counter=1;
            int current=num;
            while(set.contains(current+1)){
              counter++;
              current++;
            }
            max = Math.max(counter, max);
          }
       }
       return max;
    }
}
