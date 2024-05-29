package com.blogspot.ostas.leetcode.all.easy.binary_tree_tilt.bfs;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

import java.util.*;

class Solution {
    public int findTilt(TreeNode root) {
        if (root == null) return 0;

        // Map to store the sum of values of all nodes in the subtree rooted at each node
        Map<TreeNode, Integer> subtreeSum = new HashMap<>();
        // Queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // First pass: Compute the subtree sums using post-order BFS traversal
        Stack<TreeNode> stack = new Stack<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            stack.push(node);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        // Post-order processing to calculate subtree sums
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int leftSum = node.left != null ? subtreeSum.getOrDefault(node.left, 0) : 0;
            int rightSum = node.right != null ? subtreeSum.getOrDefault(node.right, 0) : 0;
            int nodeSum = node.val + leftSum + rightSum;
            subtreeSum.put(node, nodeSum);
        }

        // Second pass: Calculate the tilt for each node
        queue.add(root);
        int totalTilt = 0;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            int leftSum = node.left != null ? subtreeSum.get(node.left) : 0;
            int rightSum = node.right != null ? subtreeSum.get(node.right) : 0;
            int tilt = Math.abs(leftSum - rightSum);
            totalTilt += tilt;

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return totalTilt;
    }
}