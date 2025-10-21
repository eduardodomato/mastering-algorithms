package com.algorithms.week06_trees_bst;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Problem 2: Validate Binary Search Tree
 */
class Problem02_ValidateBinarySearchTreeTest {
    
    private Problem02_ValidateBinarySearchTree solution;
    
    @BeforeEach
    void setUp() {
        solution = new Problem02_ValidateBinarySearchTree();
    }
    
    @Test
    void testIsValidBST_Example1() {
        // Create tree: [2,1,3]
        var root = new Problem02_ValidateBinarySearchTree.TreeNode(2);
        root.left = new Problem02_ValidateBinarySearchTree.TreeNode(1);
        root.right = new Problem02_ValidateBinarySearchTree.TreeNode(3);
        
        assertTrue(solution.isValidBST(root));
    }
    
    @Test
    void testIsValidBST_Example2() {
        // Create tree: [5,1,4,null,null,3,6]
        var root = new Problem02_ValidateBinarySearchTree.TreeNode(5);
        root.left = new Problem02_ValidateBinarySearchTree.TreeNode(1);
        root.right = new Problem02_ValidateBinarySearchTree.TreeNode(4);
        root.right.left = new Problem02_ValidateBinarySearchTree.TreeNode(3);
        root.right.right = new Problem02_ValidateBinarySearchTree.TreeNode(6);
        
        assertFalse(solution.isValidBST(root));
    }
    
    @Test
    void testIsValidBST_SingleNode() {
        var root = new Problem02_ValidateBinarySearchTree.TreeNode(1);
        assertTrue(solution.isValidBST(root));
    }
    
    @Test
    void testIsValidBST_EmptyTree() {
        assertTrue(solution.isValidBST(null));
    }
}
