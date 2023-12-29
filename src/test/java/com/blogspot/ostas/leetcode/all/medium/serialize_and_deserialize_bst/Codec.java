package com.blogspot.ostas.leetcode.all.medium.serialize_and_deserialize_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;

/*
      449. serialize and deserialize bst

https://leetcode.com/problems/serialize-and-deserialize-bst

Serialization is converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You need to ensure that a binary search tree can be serialized to a string, and this string can be deserialized to the original tree structure.
The encoded string should be as compact as possible.

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
