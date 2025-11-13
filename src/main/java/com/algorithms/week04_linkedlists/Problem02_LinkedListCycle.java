package com.algorithms.week04_linkedlists;



/**
 * Problem 2: Linked List Cycle
 *
 * LeetCode #141 - Easy
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * A linked list has a cycle if there is some node in the list that can be reached again by
 * continuously following the next pointer. Internally, pos is used to denote the index of the
 * node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2], pos = 0
 * Output: true
 *
 * Example 3:
 * Input: head = [1], pos = -1
 * Output: false
 *
 * Constraints:
 * - The number of the nodes in the list is in the range [0, 10^4].
 * - -10^5 <= Node.val <= 10^5
 * - pos is -1 or a valid index in the linked-list.
 *
 * Follow-up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class Problem02_LinkedListCycle {

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
     * Detect whether the linked list contains a cycle.
     *
     * @param head the head node of the linked list
     * @return true if a cycle exists, false otherwise
     */
    public boolean hasCycle(ListNode head) {
        // Hint: Implement Floyd's Tortoise and Hare algorithm using two pointers
        // Hint: Fast pointer moves two steps, slow pointer moves one step per iteration
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;             // move slow by 1
            fast = fast.next.next;       // move fast by 2

            if (slow == fast) {
                return true;             // pointers met -> cycle
            }
        }

        return false;
    }
}
