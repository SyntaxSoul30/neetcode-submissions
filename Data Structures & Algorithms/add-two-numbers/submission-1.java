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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        var temp = result;
        var carry = 0;
        while (l1 != null || l2 != null) {     
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            var currentSum = val1 + val2 + carry;
            var newNode = 0;
            if (currentSum>=10) {
                newNode = currentSum - 10;
                carry =1;
            } else {
                newNode = currentSum;
                carry = 0;
            }
            temp.next = new ListNode(newNode);
            temp = temp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry==1) {
            temp.next = new ListNode(carry);
        } 
        return result.next;
    }
}
