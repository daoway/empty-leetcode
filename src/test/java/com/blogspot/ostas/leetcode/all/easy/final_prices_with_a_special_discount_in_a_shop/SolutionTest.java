package com.blogspot.ostas.leetcode.all.easy.final_prices_with_a_special_discount_in_a_shop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [8,4,6,2,3]
    Output: [4,2,4,2,3]
    Explanation:
    For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
    For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
    For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
    For items 3 and 4 you will not receive any discount at all.
    Example 2:
    Input: prices = [1,2,3,4,5]
    Output: [1,2,3,4,5]
    Explanation: In this case, for all items, you will not receive any discount at all.
    Example 3:
    Input: prices = [10,1,1,6]
    Output: [9,0,1,6]
      Constraints:
    1 <= prices.length <= 500
    1 <= prices[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{8, 4, 6, 2, 3};
        int[] expected = new int[]{4, 2, 4, 2, 3};
        var result = solution.finalPrices(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        var result = solution.finalPrices(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] prices = new int[]{10, 1, 1, 6};
        int[] expected = new int[]{9, 0, 1, 6};
        var result = solution.finalPrices(prices);
        assertThat(result).isEqualTo(expected);
    }

}
