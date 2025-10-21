package com.algorithms.week06_trees_bst;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 1: Maximum Depth of Binary Tree
 */
class Problem01_MaximumDepthOfBinaryTreeTest {
    
    private Problem01_MaximumDepthOfBinaryTree solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem01_MaximumDepthOfBinaryTree();
    }
    
    @Test
    void testMaxDepth_Example1() {
        // Create tree: [3,9,20,null,null,15,7]
        var root = new Problem01_MaximumDepthOfBinaryTree.TreeNode(3);
        root.left = new Problem01_MaximumDepthOfBinaryTree.TreeNode(9);
        root.right = new Problem01_MaximumDepthOfBinaryTree.TreeNode(20);
        root.right.left = new Problem01_MaximumDepthOfBinaryTree.TreeNode(15);
        root.right.right = new Problem01_MaximumDepthOfBinaryTree.TreeNode(7);
        
        int expected = 3;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxDepth_Example2() {
        // Create tree: [1,null,2]
        var root = new Problem01_MaximumDepthOfBinaryTree.TreeNode(1);
        root.right = new Problem01_MaximumDepthOfBinaryTree.TreeNode(2);
        
        int expected = 2;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxDepth_EmptyTree() {
        int expected = 0;
        int result = solution.maxDepth(null);
        assertEquals(expected, result);
    }
    
    @Test
    void testMaxDepth_SingleNode() {
        var root = new Problem01_MaximumDepthOfBinaryTree.TreeNode(1);
        int expected = 1;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }
}
