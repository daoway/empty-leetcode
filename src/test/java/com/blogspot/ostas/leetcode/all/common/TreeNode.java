package com.blogspot.ostas.leetcode.all.common;

import java.util.Objects;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static int height(TreeNode root) {
    if (root == null) {
      return 0;
    } else {

      // Compute  height of each subtree
      int lheight = height(root.left);
      int rheight = height(root.right);

      // use the larger one
      if (lheight > rheight) {
        return (lheight + 1);
      } else {
        return (rheight + 1);
      }
    }
  }

  static TreeNode generateBinaryTree(int number, int currentDepth, int maxDepth) {
    if (currentDepth > maxDepth) {
      return null;
    }
    TreeNode node = new TreeNode(number++);
    node.left = generateBinaryTree(number, currentDepth + 1, maxDepth);
    node.right = generateBinaryTree(number, currentDepth + 1, maxDepth);

    return node;
  }

  public static TreeNode generateBinaryTree(int number, int maxDepth) {
    return generateBinaryTree(number, 0, maxDepth);
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }

    if (p == null || q == null) {
      return false;
    }

    if (p.val != q.val) {
      return false;
    }
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }

  private static TreeNode arrayToTree(Integer[] nums, int index) {
    TreeNode root = null;

    if (index < nums.length && nums[index] != null) {
      root = new TreeNode(nums[index]);
      root.left = arrayToTree(nums, 2 * index + 1);
      root.right = arrayToTree(nums, 2 * index + 2);
    }

    return root;
  }

  public static TreeNode arrayToTree(Integer[] root) {
    return arrayToTree(root, 0);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeNode treeNode = (TreeNode) o;
    return val == treeNode.val && Objects.equals(left, treeNode.left) &&
        Objects.equals(right, treeNode.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, left, right);
  }

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    // If the node is a leaf, return 1
    if (root.left == null && root.right == null) {
      return 1;
    }

    int leftDepth = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
    int rightDepth = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

    return Math.min(leftDepth, rightDepth) + 1;
  }

  // Helper method to print the tree
  public void printTree(TreeNode node, int level) {
    if (node == null) {
      return;
    }
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }
    System.out.println(node.val);
    printTree(node.left, level + 1);
    printTree(node.right, level + 1);
  }

  public void show() {
    printTree(this, 0);
  }


}

