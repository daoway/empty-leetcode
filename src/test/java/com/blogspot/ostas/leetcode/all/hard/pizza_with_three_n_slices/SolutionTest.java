package com.blogspot.ostas.leetcode.all.hard.pizza_with_three_n_slices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: slices = [1,2,3,4,5,6]
    Output: 10
    Explanation: Pick pizza slice of size 4, Alice and Bob will pick slices with size 3 and 5 respectively. Then Pick slices with size 6, finally Alice and Bob will pick slice of size 2 and 1 respectively. Total = 4 + 6.
    Example 2:
    Input: slices = [8,9,8,6,1,1]
    Output: 16
    Explanation: Pick pizza slice of size 8 in each turn. If you pick slice with size 9 your partners will pick slices of size 8.
      Constraints:
    3 * n == slices.length
    1 <= slices.length <= 500
    1 <= slices[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] slices = new int[]{1, 2, 3, 4, 5, 6};
        int expected = 10;
        var result = solution.maxSizeSlices(slices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] slices = new int[]{8, 9, 8, 6, 1, 1};
        int expected = 16;
        var result = solution.maxSizeSlices(slices);
        assertThat(result).isEqualTo(expected);
    }

}
