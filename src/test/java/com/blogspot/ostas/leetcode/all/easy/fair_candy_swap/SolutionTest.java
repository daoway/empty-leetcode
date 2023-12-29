package com.blogspot.ostas.leetcode.all.easy.fair_candy_swap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: aliceSizes = [1,1], bobSizes = [2,2]
    Output: [1,2]
    Example 2:
    Input: aliceSizes = [1,2], bobSizes = [2,3]
    Output: [1,2]
    Example 3:
    Input: aliceSizes = [2], bobSizes = [1,3]
    Output: [2,3]
      Constraints:
    1 <= aliceSizes.length, bobSizes.length <= 104
    1 <= aliceSizes[i], bobSizes[j] <= 105
    Alice and Bob have a different total number of candies.
    There will be at least one valid answer for the given input.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] aliceSizes = new int[]{1, 1};
        int[] bobSizes = new int[]{2, 2};
        int[] expected = new int[]{1, 2};
        var result = solution.fairCandySwap(aliceSizes, bobSizes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] aliceSizes = new int[]{1, 2};
        int[] bobSizes = new int[]{2, 3};
        int[] expected = new int[]{1, 2};
        var result = solution.fairCandySwap(aliceSizes, bobSizes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] aliceSizes = new int[]{2};
        int[] bobSizes = new int[]{1, 3};
        int[] expected = new int[]{2, 3};
        var result = solution.fairCandySwap(aliceSizes, bobSizes);
        assertThat(result).isEqualTo(expected);
    }

}
