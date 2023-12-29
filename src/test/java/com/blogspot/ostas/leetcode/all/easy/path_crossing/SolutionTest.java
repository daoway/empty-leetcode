package com.blogspot.ostas.leetcode.all.easy.path_crossing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: path = "NES"
    Output: false
    Explanation: Notice that the path doesn't cross any point more than once.
    Example 2:
    Input: path = "NESWW"
    Output: true
    Explanation: Notice that the path visits the origin twice.
      Constraints:
    1 <= path.length <= 104
    path[i] is either 'N', 'S', 'E', or 'W'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String path = "NES";
        boolean expected = false;
        var result = solution.isPathCrossing(path);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String path = "NESWW";
        boolean expected = true;
        var result = solution.isPathCrossing(path);
        assertThat(result).isEqualTo(expected);
    }

}
