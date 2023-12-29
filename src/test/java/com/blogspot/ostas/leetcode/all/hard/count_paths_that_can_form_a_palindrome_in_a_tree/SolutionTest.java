package com.blogspot.ostas.leetcode.all.hard.count_paths_that_can_form_a_palindrome_in_a_tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: parent = [-1,0,0,1,1,2], s = "acaabc"
    Output: 8
    Explanation: The valid pairs are:
    - All the pairs (0,1), (0,2), (1,3), (1,4) and (2,5) result in one character which is always a palindrome.
    - The pair (2,3) result in the string "aca" which is a palindrome.
    - The pair (1,5) result in the string "cac" which is a palindrome.
    - The pair (3,5) result in the string "acac" which can be rearranged into the palindrome "acca".
    Example 2:
    Input: parent = [-1,0,0,0,0], s = "aaaaa"
    Output: 10
    Explanation: Any pair of nodes (u,v) where u < v is valid.
      Constraints:
    n == parent.length == s.length
    1 <= n <= 105
    0 <= parent[i] <= n - 1 for all i >= 1
    parent[0] == -1
    parent represents a valid tree.
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> parent = List.of(1, 0, 0, 1, 1, 2);
        String s = "acaabc";
        long expected = 8;
        var result = solution.countPalindromePaths(parent, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> parent = List.of(1, 0, 0, 0, 0);
        String s = "aaaaa";
        long expected = 10;
        var result = solution.countPalindromePaths(parent, s);
        assertThat(result).isEqualTo(expected);
    }

}
