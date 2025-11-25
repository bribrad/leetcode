/**
 * Completed: 2025-05-04
 * Difficulty: Easy
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/description/
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
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode node = head.next;
        while (node != null) {
            count++;
            node = node.next;
        }

        int mid = count / 2;
        int index = 1;
        node = head.next;
        while (index < mid) {
            node = node.next;
            index++;
        }
        return node != null ? node : head;
    }
}