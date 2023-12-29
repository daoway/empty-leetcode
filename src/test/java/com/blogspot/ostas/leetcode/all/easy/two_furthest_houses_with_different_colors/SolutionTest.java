package com.blogspot.ostas.leetcode.all.easy.two_furthest_houses_with_different_colors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: colors = [1,1,1,6,1,1,1]
    Output: 3
    Explanation: In the above image, color 1 is blue, and color 6 is red.
    The furthest two houses with different colors are house 0 and house 3.
    House 0 has color 1, and house 3 has color 6. The distance between them is abs(0 - 3) = 3.
    Note that houses 3 and 6 can also produce the optimal answer.
    Example 2:
    Input: colors = [1,8,3,8,3]
    Output: 4
    Explanation: In the above image, color 1 is blue, color 8 is yellow, and color 3 is green.
    The furthest two houses with different colors are house 0 and house 4.
    House 0 has color 1, and house 4 has color 3. The distance between them is abs(0 - 4) = 4.
    Example 3:
    Input: colors = [0,1]
    Output: 1
    Explanation: The furthest two houses with different colors are house 0 and house 1.
    House 0 has color 0, and house 1 has color 1. The distance between them is abs(0 - 1) = 1.
      Constraints:
    n == colors.length
    2 <= n <= 100
    0 <= colors[i] <= 100
    Test data are generated such that at least two houses have different colors.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] colors = new int[]{1, 1, 1, 6, 1, 1, 1};
        int expected = 3;
        var result = solution.maxDistance(colors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] colors = new int[]{1, 8, 3, 8, 3};
        int expected = 4;
        var result = solution.maxDistance(colors);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] colors = new int[]{0, 1};
        int expected = 1;
        var result = solution.maxDistance(colors);
        assertThat(result).isEqualTo(expected);
    }

}
