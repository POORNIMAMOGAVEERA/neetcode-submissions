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
        ListNode curr = head, prev=head;
        int k=0, m=0;
        while(curr!=null){
           m++;
           curr=curr.next;      
        }
        if(m==n){
          head = head.next;
          return head;
        }
        curr=head;
        while(curr!=null){
            if(m-k==n){
              ListNode temp = curr.next;
              curr = prev;
              curr.next = temp;
              return head;
            }
            prev= curr;
            curr=curr.next;
            k++;
        }
        return head;
    }
}
