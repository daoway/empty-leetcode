package com.blogspot.ostas.leetcode.all.medium.koko_eating_bananas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: piles = [3,6,7,11], h = 8
    Output: 4
    Example 2:
    Input: piles = [30,11,23,4,20], h = 5
    Output: 30
    Example 3:
    Input: piles = [30,11,23,4,20], h = 6
    Output: 23
      Constraints:
    1 <= piles.length <= 104
    piles.length <= h <= 109
    1 <= piles[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] piles = new int[]{3, 6, 7, 11};
        int h = 8;
        int expected = 4;
        var result = solution.minEatingSpeed(piles, h);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] piles = new int[]{30, 11, 23, 4, 20};
        int h = 5;
        int expected = 30;
        var result = solution.minEatingSpeed(piles, h);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] piles = new int[]{30, 11, 23, 4, 20};
        int h = 6;
        int expected = 23;
        var result = solution.minEatingSpeed(piles, h);
        assertThat(result).isEqualTo(expected);
    }

}
