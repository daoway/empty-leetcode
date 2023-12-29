package com.blogspot.ostas.leetcode.all.easy.height_checker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: heights = [1,1,4,2,1,3]
    Output: 3
    Explanation:
    heights:  [1,1,4,2,1,3]
    expected: [1,1,1,2,3,4]
    Indices 2, 4, and 5 do not match.
    Example 2:
    Input: heights = [5,1,2,3,4]
    Output: 5
    Explanation:
    heights:  [5,1,2,3,4]
    expected: [1,2,3,4,5]
    All indices do not match.
    Example 3:
    Input: heights = [1,2,3,4,5]
    Output: 0
    Explanation:
    heights:  [1,2,3,4,5]
    expected: [1,2,3,4,5]
    All indices match.
      Constraints:
    1 <= heights.length <= 100
    1 <= heights[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        int expected = 3;
        var result = solution.heightChecker(heights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] heights = new int[]{5, 1, 2, 3, 4};
        int expected = 5;
        var result = solution.heightChecker(heights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] heights = new int[]{1, 2, 3, 4, 5};
        int expected = 0;
        var result = solution.heightChecker(heights);
        assertThat(result).isEqualTo(expected);
    }

}
