class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int result = 0;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        for(int i=0;i<list.size()-1;i++){
            int[] leftInterval = list.get(i);
            int[] rightInterval = list.get(i+1);
            if(leftInterval[1]>rightInterval[0]){
                result++;
                int min = leftInterval[1]>rightInterval[1]?i:i+1;
                list.remove(min);
                i--;
            }
        }
        return result;
    }
}
