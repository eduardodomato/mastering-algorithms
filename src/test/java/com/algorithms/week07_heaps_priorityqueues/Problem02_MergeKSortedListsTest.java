package com.algorithms.week07_heaps_priorityqueues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Merge k Sorted Lists
 */
class Problem02_MergeKSortedListsTest {
    
    private Problem02_MergeKSortedLists solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_MergeKSortedLists();
    }
    
    @Test
    void testMergeKLists_Example1() {
        // Create lists: [[1,4,5],[1,3,4],[2,6]]
        var list1 = new Problem02_MergeKSortedLists.ListNode(1);
        list1.next = new Problem02_MergeKSortedLists.ListNode(4);
        list1.next.next = new Problem02_MergeKSortedLists.ListNode(5);
        
        var list2 = new Problem02_MergeKSortedLists.ListNode(1);
        list2.next = new Problem02_MergeKSortedLists.ListNode(3);
        list2.next.next = new Problem02_MergeKSortedLists.ListNode(4);
        
        var list3 = new Problem02_MergeKSortedLists.ListNode(2);
        list3.next = new Problem02_MergeKSortedLists.ListNode(6);
        
        var lists = new Problem02_MergeKSortedLists.ListNode[]{list1, list2, list3};
        var result = solution.mergeKLists(lists);
        
        // Verify: 1->1->2->3->4->4->5->6
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.next.val);
        assertEquals(6, result.next.next.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next.next.next);
    }
    
    @Test
    void testMergeKLists_EmptyArray() {
        var lists = new Problem02_MergeKSortedLists.ListNode[0];
        var result = solution.mergeKLists(lists);
        assertNull(result);
    }
    
    @Test
    void testMergeKLists_SingleList() {
        var list1 = new Problem02_MergeKSortedLists.ListNode(1);
        list1.next = new Problem02_MergeKSortedLists.ListNode(2);
        
        var lists = new Problem02_MergeKSortedLists.ListNode[]{list1};
        var result = solution.mergeKLists(lists);
        
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }
}
