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
    public ListNode merge(ListNode node1, ListNode node2){
       ListNode result = new ListNode(0);
       ListNode curr = result;
       while(node1!=null && node2!=null){
         if(node1.val<=node2.val){
           curr.next = node1;
           node1 = node1.next;
         }else{
            curr.next= node2;
            node2 = node2.next;
         }
         curr = curr.next;
       }
       if(node1!=null){
        curr.next = node1;
       }
       if(node2!=null){
        curr.next = node2;
       }
       return result.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists==null || lists.length==0){
        return null;
       }
       int intervals = 1;
       while(intervals<lists.length){
       for(int i=0;i+intervals<lists.length;i+=intervals*2){
          lists[i]=merge(lists[i],lists[i+intervals]);
        }
        intervals*=2;
       }
       return lists[0];
    }
}
