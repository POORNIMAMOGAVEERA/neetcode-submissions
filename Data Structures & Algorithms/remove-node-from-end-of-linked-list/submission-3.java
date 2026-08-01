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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode curr = head;
       int size = 0;
       while(curr!=null){
          size++;
         curr = curr.next;
       }
       if(size == n){
        return head.next;
       }
       int counter=0;
       ListNode prev = head;
       curr = head;
       while(curr!=null){
        counter+=1;
        if(counter==(size-n+1)){
          ListNode temp = curr.next;
          curr = prev;
          curr.next = temp;
          break;
        }
        prev = curr;
        curr = curr.next;
       }
       return head;
    }
}
