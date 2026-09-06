class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0) return 0;
       Set<Integer> set = new TreeSet<>();

       for(int num: nums){
        set.add(num);
       }  

       int counter = 1, max = 0;
       List<Integer> list = new ArrayList<>(set);
       for(int i=1;i<list.size();i++){
        if(list.get(i)!=(list.get(i-1)+1)){
            max = counter>max? counter: max;
            counter = 1;
        }else{
            counter++;
        }
       }
       max = counter>max? counter: max;
       return max;
    }
}
