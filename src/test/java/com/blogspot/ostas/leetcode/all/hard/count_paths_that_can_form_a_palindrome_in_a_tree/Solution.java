package com.blogspot.ostas.leetcode.all.hard.count_paths_that_can_form_a_palindrome_in_a_tree;

import java.util.List;

/*
      2791. count paths that can form a palindrome in a tree

https://leetcode.com/problems/count-paths-that-can-form-a-palindrome-in-a-tree

You are given a tree (i.e. a connected, undirected graph that has no cycles) rooted at node 0 consisting of n nodes numbered from 0 to n - 1. The tree is represented by a 0-indexed array parent of size n, where parent[i] is the parent of node i. Since node 0 is the root, parent[0] == -1.
You are also given a string s of length n, where s[i] is the character assigned to the edge between i and parent[i]. s[0] can be ignored.
Return the number of pairs of nodes (u, v) such that u < v and the characters assigned to edges on the path from u to v can be rearranged to form a palindrome.
A string is a palindrome when it reads the same backwards as forwards.

*/
class Solution {
  public long countPalindromePaths(List<Integer> parent, String s) {
    return 0;
  }
}