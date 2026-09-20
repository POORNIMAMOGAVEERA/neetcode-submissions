/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
      if(intervals.size() == 0) return 0;

      intervals.sort((a,b)-> Integer.compare(a.start, b.start));

      PriorityQueue<Integer> minheap = new PriorityQueue<>();

    for(Interval interval: intervals){
      if(!minheap.isEmpty() && interval.start >=minheap.peek()){
        minheap.poll();
      }
      minheap.offer(interval.end);
    }
     return minheap.size(); 
    }
}
