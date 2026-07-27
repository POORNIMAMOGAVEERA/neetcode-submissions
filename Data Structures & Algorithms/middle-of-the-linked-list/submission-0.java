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
    public ListNode middleNode(ListNode head) {
        ListNode middle= null;
        ListNode curr = head;
        int n=0;
        while(curr!=null){
            n+=1;
            curr = curr.next;
        }
        curr = head;
        n=(n/2)+1;
        int i=1;
        while(i<n){
          curr = curr.next;
          i++;
        }
        return curr;
    }
}