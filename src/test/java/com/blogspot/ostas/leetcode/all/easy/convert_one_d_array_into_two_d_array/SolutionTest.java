package com.blogspot.ostas.leetcode.all.easy.convert_one_d_array_into_two_d_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: original = [1,2,3,4], m = 2, n = 2
    Output: [[1,2],[3,4]]
    Explanation: The constructed 2D array should contain 2 rows and 2 columns.
    The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
    The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.
    Example 2:
    Input: original = [1,2,3], m = 1, n = 3
    Output: [[1,2,3]]
    Explanation: The constructed 2D array should contain 1 row and 3 columns.
    Put all three elements in original into the first row of the constructed 2D array.
    Example 3:
    Input: original = [1,2], m = 1, n = 1
    Output: []
    Explanation: There are 2 elements in original.
    It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.
      Constraints:
    1 <= original.length <= 5 * 104
    1 <= original[i] <= 105
    1 <= m, n <= 4 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] original = new int[]{1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        var result = solution.construct2DArray(original, m, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] original = new int[]{1, 2, 3};
        int m = 1;
        int n = 3;
        int[][] expected = new int[][]{{1, 2, 3}};
        var result = solution.construct2DArray(original, m, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] original = new int[]{1, 2};
        int m = 1;
        int n = 1;
        int[][] expected = new int[][]{};
        var result = solution.construct2DArray(original, m, n);
        assertThat(result).isEqualTo(expected);
    }

}
