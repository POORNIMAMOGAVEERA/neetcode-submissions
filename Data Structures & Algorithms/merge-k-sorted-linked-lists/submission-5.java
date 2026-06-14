/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> minheap = new PriorityQueue<>((a,b)->a.val - b.val);
      for(ListNode list: lists){
        if(list!=null){
            minheap.offer(list);
        }
      }
      ListNode result = new ListNode(-1);
      ListNode curr = result;
      while(!minheap.isEmpty()){
        ListNode smallest = minheap.poll();
        curr.next = smallest;
        curr = curr.next;
        if(smallest.next!=null){
          minheap.offer(smallest.next);
        }
      }
      return result.next;
    }
}
