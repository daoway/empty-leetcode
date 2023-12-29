package com.blogspot.ostas.leetcode.all.hard.longest_path_with_different_adjacent_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: parent = [-1,0,0,1,1,2], s = "abacbe"
    Output: 3
    Explanation: The longest path where each two adjacent nodes have different characters in the tree is the path: 0 -> 1 -> 3. The length of this path is 3, so 3 is returned.
    It can be proven that there is no longer path that satisfies the conditions.
    Example 2:
    Input: parent = [-1,0,0,0], s = "aabc"
    Output: 3
    Explanation: The longest path where each two adjacent nodes have different characters is the path: 2 -> 0 -> 3. The length of this path is 3, so 3 is returned.
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
        int[] parent = new int[]{-1, 0, 0, 1, 1, 2};
        String s = "abacbe";
        int expected = 3;
        var result = solution.longestPath(parent, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] parent = new int[]{-1, 0, 0, 0};
        String s = "aabc";
        int expected = 3;
        var result = solution.longestPath(parent, s);
        assertThat(result).isEqualTo(expected);
    }

}
