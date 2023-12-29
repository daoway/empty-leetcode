package com.blogspot.ostas.leetcode.all.hard.selling_pieces_of_wood;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 3, n = 5, prices = [[1,4,2],[2,2,7],[2,1,3]]
    Output: 19
    Explanation: The diagram above shows a possible scenario. It consists of:
    - 2 pieces of wood shaped 2 x 2, selling for a price of 2 * 7 = 14.
    - 1 piece of wood shaped 2 x 1, selling for a price of 1 * 3 = 3.
    - 1 piece of wood shaped 1 x 4, selling for a price of 1 * 2 = 2.
    This obtains a total of 14 + 3 + 2 = 19 money earned.
    It can be shown that 19 is the maximum amount of money that can be earned.
    Example 2:
    Input: m = 4, n = 6, prices = [[3,2,10],[1,4,2],[4,1,3]]
    Output: 32
    Explanation: The diagram above shows a possible scenario. It consists of:
    - 3 pieces of wood shaped 3 x 2, selling for a price of 3 * 10 = 30.
    - 1 piece of wood shaped 1 x 4, selling for a price of 1 * 2 = 2.
    This obtains a total of 30 + 2 = 32 money earned.
    It can be shown that 32 is the maximum amount of money that can be earned.
    Notice that we cannot rotate the 1 x 4 piece of wood to obtain a 4 x 1 piece of wood.
      Constraints:
    1 <= m, n <= 200
    1 <= prices.length <= 2 * 104
    prices[i].length == 3
    1 <= hi <= m
    1 <= wi <= n
    1 <= pricei <= 106
    All the shapes of wood (hi, wi) are pairwise distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 3;
        int n = 5;
        int[][] prices = new int[][]{{1, 4, 2}, {2, 2, 7}, {2, 1, 3}};
        long expected = 19;
        var result = solution.sellingWood(m, n, prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 4;
        int n = 6;
        int[][] prices = new int[][]{{3, 2, 10}, {1, 4, 2}, {4, 1, 3}};
        long expected = 32;
        var result = solution.sellingWood(m, n, prices);
        assertThat(result).isEqualTo(expected);
    }

}
