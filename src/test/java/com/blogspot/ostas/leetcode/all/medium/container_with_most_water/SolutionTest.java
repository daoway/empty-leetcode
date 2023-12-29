package com.blogspot.ostas.leetcode.all.medium.container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
    Example 2:
    Input: height = [1,1]
    Output: 1
      Constraints:
    n == height.length
    2 <= n <= 105
    0 <= height[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        var result = solution.maxArea(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] height = new int[]{1, 1};
        int expected = 1;
        var result = solution.maxArea(height);
        assertThat(result).isEqualTo(expected);
    }

}
