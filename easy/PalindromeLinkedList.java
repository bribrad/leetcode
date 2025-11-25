/**
 * Completed: 2025-05-04
 * Difficulty: Easy
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/description/
 */

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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        String values = "" + head.val;
        ListNode node = head.next;
        
        while (node != null) {
            values += "" + node.val;
            node = node.next;
        }

        int start = 0;
        int end = values.length() - 1;

        while (start < end) {
            if (values.charAt(start) != values.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}