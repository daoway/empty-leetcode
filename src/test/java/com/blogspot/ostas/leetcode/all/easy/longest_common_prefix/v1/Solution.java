package com.blogspot.ostas.leetcode.all.easy.longest_common_prefix.v1;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    TrieNode root = new TrieNode();

    // Insert all strings into the Trie
    for (final String str : strs) {
      if (str.isEmpty()) {
        return ""; // Handle empty strings
      }
      TrieNode node = root;
      for (char ch : str.toCharArray()) {
        if (!node.children.containsKey(ch)) {
          node.children.put(ch, new TrieNode());
        }
        node = node.children.get(ch);
      }
      node.isEnd = true;
    }

    // Find the longest common prefix
    StringBuilder commonPrefix = new StringBuilder();
    TrieNode node = root;

    while (node.children.size() == 1 && !node.isEnd) {
      char ch = node.children.keySet().iterator().next();
      commonPrefix.append(ch);
      node = node.children.get(ch);
    }

    return commonPrefix.toString();
  }

  static class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    public TrieNode() {
      children = new HashMap<>();
      isEnd = false;
    }
  }
}
