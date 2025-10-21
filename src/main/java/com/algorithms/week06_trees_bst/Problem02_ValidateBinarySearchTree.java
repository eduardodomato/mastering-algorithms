package com.algorithms.week06_trees_bst;

/**
 * Problem 2: Validate Binary Search Tree
 * 
 * LeetCode #98 - Medium
 * 
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * A valid BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the node's key.
 * - The right subtree of a node contains only nodes with keys greater than the node's key.
 * - Both the left and right subtrees must also be binary search trees.
 * 
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10^4].
 * - -2^31 <= Node.val <= 2^31 - 1
 * 
 * Example 1:
 * Input: root = [2,1,3]
 * Output: true
 * 
 * Example 2:
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 * 
 * Follow-up: Can you solve it using O(1) extra space?
 */
public class Problem02_ValidateBinarySearchTree {
    
    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    /**
     * Check if the binary tree is a valid BST.
     * 
     * @param root root of the binary tree
     * @return true if valid BST, false otherwise
     */
    public boolean isValidBST(TreeNode root) {
        // TODO: Implement your solution here
        // Hint: Use inorder traversal or pass min/max bounds
        // Time complexity: O(n)
        // Space complexity: O(h) where h is height of tree
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
