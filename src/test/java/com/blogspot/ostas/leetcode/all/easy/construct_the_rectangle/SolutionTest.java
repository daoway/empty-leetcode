package com.blogspot.ostas.leetcode.all.easy.construct_the_rectangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: area = 4
    Output: [2,2]
    Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1].
    But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
    Example 2:
    Input: area = 37
    Output: [37,1]
    Example 3:
    Input: area = 122122
    Output: [427,286]
      Constraints:
    1 <= area <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int area = 4;
        int[] expected = new int[]{2, 2};
        var result = solution.constructRectangle(area);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int area = 37;
        int[] expected = new int[]{37, 1};
        var result = solution.constructRectangle(area);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int area = 122122;
        int[] expected = new int[]{427, 286};
        var result = solution.constructRectangle(area);
        assertThat(result).isEqualTo(expected);
    }

}
