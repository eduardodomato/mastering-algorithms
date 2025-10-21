package com.algorithms.week04_linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Merge Two Sorted Lists
 */
class Problem03_MergeTwoSortedListsTest {
    
    private Problem03_MergeTwoSortedLists solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_MergeTwoSortedLists();
    }
    
    @Test
    void testMergeTwoLists_Example1() {
        // List1: 1->2->4
        var list1 = new Problem03_MergeTwoSortedLists.ListNode(1);
        list1.next = new Problem03_MergeTwoSortedLists.ListNode(2);
        list1.next.next = new Problem03_MergeTwoSortedLists.ListNode(4);
        
        // List2: 1->3->4
        var list2 = new Problem03_MergeTwoSortedLists.ListNode(1);
        list2.next = new Problem03_MergeTwoSortedLists.ListNode(3);
        list2.next.next = new Problem03_MergeTwoSortedLists.ListNode(4);
        
        var result = solution.mergeTwoLists(list1, list2);
        
        // Verify: 1->1->2->3->4->4
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next);
    }
    
    @Test
    void testMergeTwoLists_Example2() {
        var result = solution.mergeTwoLists(null, null);
        assertNull(result);
    }
    
    @Test
    void testMergeTwoLists_Example3() {
        var list2 = new Problem03_MergeTwoSortedLists.ListNode(0);
        var result = solution.mergeTwoLists(null, list2);
        
        assertEquals(0, result.val);
        assertNull(result.next);
    }
    
    @Test
    void testMergeTwoLists_OneEmpty() {
        var list1 = new Problem03_MergeTwoSortedLists.ListNode(1);
        list1.next = new Problem03_MergeTwoSortedLists.ListNode(2);
        
        var result = solution.mergeTwoLists(list1, null);
        
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }
}
