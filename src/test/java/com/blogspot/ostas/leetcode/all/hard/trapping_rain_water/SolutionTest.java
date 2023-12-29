package com.blogspot.ostas.leetcode.all.hard.trapping_rain_water;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
    Example 2:
    Input: height = [4,2,0,3,2,5]
    Output: 9
      Constraints:
    n == height.length
    1 <= n <= 2 * 104
    0 <= height[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        var result = solution.trap(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] height = new int[]{4, 2, 0, 3, 2, 5};
        int expected = 9;
        var result = solution.trap(height);
        assertThat(result).isEqualTo(expected);
    }

}
