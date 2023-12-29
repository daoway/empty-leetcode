package com.blogspot.ostas.leetcode.all.medium.maximum_nesting_depth_of_two_valid_parentheses_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: seq = "(()())"
    Output: [0,1,1,1,1,0]
    Example 2:
    Input: seq = "()(())()"
    Output: [0,0,0,1,1,0,1,1]
      Constraints:
    1 <= seq.size <= 10000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String seq = "(()())";
        int[] expected = new int[]{0, 1, 1, 1, 1, 0};
        var result = solution.maxDepthAfterSplit(seq);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String seq = "()(())()";
        int[] expected1 = new int[]{0, 0, 0, 1, 1, 0, 1, 1};
        int[] expected2 = new int[]{0, 0, 0, 1, 1, 0, 0, 0};
        var result = solution.maxDepthAfterSplit(seq);
        assertThat(result).isIn(expected1, expected2);
    }

}
