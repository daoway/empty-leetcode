package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_coins_you_can_get;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: piles = [2,4,1,2,7,8]
    Output: 9
    Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
    Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
    The maximum number of coins which you can have are: 7 + 2 = 9.
    On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.
    Example 2:
    Input: piles = [2,4,5]
    Output: 4
    Example 3:
    Input: piles = [9,8,7,6,5,1,2,3,4]
    Output: 18
      Constraints:
    3 <= piles.length <= 105
    piles.length % 3 == 0
    1 <= piles[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] piles = new int[]{2, 4, 1, 2, 7, 8};
        int expected = 9;
        var result = solution.maxCoins(piles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] piles = new int[]{2, 4, 5};
        int expected = 4;
        var result = solution.maxCoins(piles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] piles = new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4};
        int expected = 18;
        var result = solution.maxCoins(piles);
        assertThat(result).isEqualTo(expected);
    }

}
