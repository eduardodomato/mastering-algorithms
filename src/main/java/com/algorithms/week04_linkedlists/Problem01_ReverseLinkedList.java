package com.algorithms.week04_linkedlists;

/**
 * Problem 1: Reverse Linked List
 *
 * LeetCode #206 - Easy
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Example 3:
 * Input: head = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the list is in the range [0, 5000].
 * - -5000 <= Node.val <= 5000
 *
 * Follow-up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Problem01_ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Reverse a singly linked list.
     *
     * @param head the head of the linked list
     * @return the head of the reversed linked list
     */
    public ListNode reverseList(ListNode head) {
        // TODO: Implement iterative reversal using three pointers (prev, current, next)
        // Hint: Track the previous node while iterating through the list
        return head;
    }
}
