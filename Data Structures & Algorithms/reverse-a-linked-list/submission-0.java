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
    public ListNode reverseList(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        var clone = head;
        while(clone!=null) {
            stack.push(clone.val);
            clone = clone.next;
        }
        clone = head;
        while (!stack.isEmpty()) {
            clone.val = stack.pop();
            clone = clone.next;
        }
        return head;
    }
}
