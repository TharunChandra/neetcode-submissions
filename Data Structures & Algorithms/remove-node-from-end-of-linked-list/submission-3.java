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

        head = reverse(head);
        ListNode node = head;
        int i = 1;
        if(n == 1) {
            return reverse(node.next);
        }
        while (i <= n-1 && node.next != null) {
            if(i == n-1) {
                System.out.println("Removing "+node.next.val);
                node.next = node.next.next;
                return reverse(head);
            }
            i++;
            node = node.next;
        }
        if(node.next == null) {
            return head.next;
        }
        return null;
    }

    public ListNode reverse(ListNode head) {
        ListNode node = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = node;
            node = head;
            head = tmp;
        }
        return node;
    }
}
