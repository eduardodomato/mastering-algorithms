package com.algorithms.week05_stacks_queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 3: Binary Tree Level Order Traversal
 */
class Problem03_BinaryTreeLevelOrderTraversalTest {
    
    private Problem03_BinaryTreeLevelOrderTraversal solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem03_BinaryTreeLevelOrderTraversal();
    }
    
    @Test
    void testLevelOrder_Example1() {
        // Create tree: [3,9,20,null,null,15,7]
        var root = new Problem03_BinaryTreeLevelOrderTraversal.TreeNode(3);
        root.left = new Problem03_BinaryTreeLevelOrderTraversal.TreeNode(9);
        root.right = new Problem03_BinaryTreeLevelOrderTraversal.TreeNode(20);
        root.right.left = new Problem03_BinaryTreeLevelOrderTraversal.TreeNode(15);
        root.right.right = new Problem03_BinaryTreeLevelOrderTraversal.TreeNode(7);
        
        var result = solution.levelOrder(root);
        
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(3, result.get(0).get(0));
        assertEquals(2, result.get(1).size());
        assertEquals(9, result.get(1).get(0));
        assertEquals(20, result.get(1).get(1));
        assertEquals(2, result.get(2).size());
        assertEquals(15, result.get(2).get(0));
        assertEquals(7, result.get(2).get(1));
    }
    
    @Test
    void testLevelOrder_Example2() {
        var root = new Problem03_BinaryTreeLevelOrderTraversal.TreeNode(1);
        var result = solution.levelOrder(root);
        
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(1, result.get(0).get(0));
    }
    
    @Test
    void testLevelOrder_EmptyTree() {
        var result = solution.levelOrder(null);
        assertTrue(result.isEmpty());
    }
}
