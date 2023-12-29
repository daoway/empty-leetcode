package com.blogspot.ostas.leetcode.all.hard.serialize_and_deserialize_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      297. serialize and deserialize binary tree

https://leetcode.com/problems/serialize-and-deserialize-binary-tree

Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

*/

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Codec {
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serializeHelper(root, sb);
    return sb.toString();
  }

  private void serializeHelper(TreeNode node, StringBuilder sb) {
    if (node == null) {
      sb.append("X,");
    } else {
      sb.append(node.val).append(",");
      serializeHelper(node.left, sb);
      serializeHelper(node.right, sb);
    }
  }

  public TreeNode deserialize(String data) {
    return deserializeHelper(new ArrayDeque<>(List.of(data.split(","))));
  }

  private TreeNode deserializeHelper(Queue<String> nodesQueue) {
    String valueForNode = nodesQueue.poll();
    if (valueForNode == null || valueForNode.equals("X")) {
      return null;
    }
    TreeNode newNode = new TreeNode(Integer.parseInt(valueForNode));
    newNode.left = deserializeHelper(nodesQueue);
    newNode.right = deserializeHelper(nodesQueue);
    return newNode;
  }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));