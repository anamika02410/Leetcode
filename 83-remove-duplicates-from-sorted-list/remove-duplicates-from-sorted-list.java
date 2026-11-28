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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow=head;
        while(slow!=null && slow.next!=null){
            if(slow.val==slow.next.val){
                slow.next=slow.next.next;
            }
            else{
                slow=slow.next;
            }
        }
        return head;
    }
}