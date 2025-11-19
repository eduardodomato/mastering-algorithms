package com.algorithms.week04_linkedlists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Problem03_MergeTwoSortedListsTest {

    private Problem03_MergeTwoSortedLists.ListNode buildList(int... values) {
        Problem03_MergeTwoSortedLists.ListNode dummy = new Problem03_MergeTwoSortedLists.ListNode(0);
        Problem03_MergeTwoSortedLists.ListNode current = dummy;
        for (int value : values) {
            current.next = new Problem03_MergeTwoSortedLists.ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(Problem03_MergeTwoSortedLists.ListNode head) {
        int length = 0;
        Problem03_MergeTwoSortedLists.ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int[] result = new int[length];
        temp = head;
        int index = 0;
        while (temp != null) {
            result[index++] = temp.val;
            temp = temp.next;
        }

        return result;
    }

    @Test
    void mergeTwoLists_bothNonEmpty() {
        Problem03_MergeTwoSortedLists solution = new Problem03_MergeTwoSortedLists();
        Problem03_MergeTwoSortedLists.ListNode list1 = buildList(1, 2, 4);
        Problem03_MergeTwoSortedLists.ListNode list2 = buildList(1, 3, 4);

        Problem03_MergeTwoSortedLists.ListNode merged = solution.mergeTwoLists(list1, list2);

        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(merged));
    }

    @Test
    void mergeTwoLists_oneEmpty() {
        Problem03_MergeTwoSortedLists solution = new Problem03_MergeTwoSortedLists();
        Problem03_MergeTwoSortedLists.ListNode list1 = buildList();
        Problem03_MergeTwoSortedLists.ListNode list2 = buildList(0);

        Problem03_MergeTwoSortedLists.ListNode merged = solution.mergeTwoLists(list1, list2);

        assertArrayEquals(new int[]{0}, toArray(merged));
    }

    @Test
    void mergeTwoLists_bothEmpty() {
        Problem03_MergeTwoSortedLists solution = new Problem03_MergeTwoSortedLists();

        Problem03_MergeTwoSortedLists.ListNode merged = solution.mergeTwoLists(null, null);

        assertNull(merged);
    }
}
