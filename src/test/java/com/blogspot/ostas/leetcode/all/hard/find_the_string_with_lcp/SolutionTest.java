package com.blogspot.ostas.leetcode.all.hard.find_the_string_with_lcp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: lcp = [[4,0,2,0],[0,3,0,1],[2,0,2,0],[0,1,0,1]]
    Output: "abab"
    Explanation: lcp corresponds to any 4 letter string with two alternating letters. The lexicographically smallest of them is "abab".
    Example 2:
    Input: lcp = [[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,1]]
    Output: "aaaa"
    Explanation: lcp corresponds to any 4 letter string with a single distinct letter. The lexicographically smallest of them is "aaaa".
    Example 3:
    Input: lcp = [[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,3]]
    Output: ""
    Explanation: lcp[3][3] cannot be equal to 3 since word[3,...,3] consists of only a single letter; Thus, no answer exists.
      Constraints:
    1 <= n == lcp.length == lcp[i].length <= 1000
    0 <= lcp[i][j] <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] lcp = new int[][]{{4, 0, 2, 0}, {0, 3, 0, 1}, {2, 0, 2, 0}, {0, 1, 0, 1}};
        String expected = "abab";
        var result = solution.findTheString(lcp);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] lcp = new int[][]{{4, 3, 2, 1}, {3, 3, 2, 1}, {2, 2, 2, 1}, {1, 1, 1, 1}};
        String expected = "aaaa";
        var result = solution.findTheString(lcp);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] lcp = new int[][]{{4, 3, 2, 1}, {3, 3, 2, 1}, {2, 2, 2, 1}, {1, 1, 1, 3}};
        String expected = "";
        var result = solution.findTheString(lcp);
        assertThat(result).isEqualTo(expected);
    }

}
