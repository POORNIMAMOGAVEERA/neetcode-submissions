class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
       List<int[]> result = new ArrayList<>();
       result.add(intervals[0]);
       for(int i=1;i<intervals.length;i++){
            int[] last = result.getLast();
            int[] curr = intervals[i];
            if(curr[0]<= last[1]){
                last[1] = Math.max(last[1],curr[1]);
            }else{
                result.addLast(curr);
            }
        } 
        return result.toArray(new int[result.size()][]);
    }
}
