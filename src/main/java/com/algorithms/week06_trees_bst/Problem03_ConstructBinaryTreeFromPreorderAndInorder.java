package com.algorithms.week06_trees_bst;

/**
 * Problem 3: Construct Binary Tree from Preorder and Inorder Traversal
 * 
 * LeetCode #105 - Medium
 * 
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal 
 * of a binary tree and inorder is the inorder traversal of the same tree, construct and 
 * return the binary tree.
 * 
 * Constraints:
 * - 1 <= preorder.length <= 3000
 * - inorder.length == preorder.length
 * - -3000 <= preorder[i], inorder[i] <= 3000
 * - preorder and inorder consist of unique values.
 * - Each value of inorder also appears in preorder.
 * - preorder is guaranteed to be the preorder traversal of the tree.
 * - inorder is guaranteed to be the inorder traversal of the tree.
 * 
 * Example 1:
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * 
 * Example 2:
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 * 
 * Follow-up: Can you solve it using O(1) extra space?
 */
public class Problem03_ConstructBinaryTreeFromPreorderAndInorder {
    
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
     * Construct binary tree from preorder and inorder traversals.
     * 
     * @param preorder preorder traversal array
     * @param inorder inorder traversal array
     * @return root of constructed binary tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO: Implement your solution here
        // Hint: First element in preorder is root, find it in inorder to split left/right
        // Time complexity: O(n)
        // Space complexity: O(n)
        
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
