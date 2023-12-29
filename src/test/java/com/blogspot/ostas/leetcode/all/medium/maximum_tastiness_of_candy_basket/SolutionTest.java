package com.blogspot.ostas.leetcode.all.medium.maximum_tastiness_of_candy_basket;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: price = [13,5,1,8,21,2], k = 3
    Output: 8
    Explanation: Choose the candies with the prices [13,5,21].
    The tastiness of the candy basket is: min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8.
    It can be proven that 8 is the maximum tastiness that can be achieved.
    Example 2:
    Input: price = [1,3,1], k = 2
    Output: 2
    Explanation: Choose the candies with the prices [1,3].
    The tastiness of the candy basket is: min(|1 - 3|) = min(2) = 2.
    It can be proven that 2 is the maximum tastiness that can be achieved.
    Example 3:
    Input: price = [7,7,7,7], k = 2
    Output: 0
    Explanation: Choosing any two distinct candies from the candies we have will result in a tastiness of 0.
      Constraints:
    2 <= k <= price.length <= 105
    1 <= price[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] price = new int[]{13, 5, 1, 8, 21, 2};
        int k = 3;
        int expected = 8;
        var result = solution.maximumTastiness(price, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] price = new int[]{1, 3, 1};
        int k = 2;
        int expected = 2;
        var result = solution.maximumTastiness(price, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] price = new int[]{7, 7, 7, 7};
        int k = 2;
        int expected = 0;
        var result = solution.maximumTastiness(price, k);
        assertThat(result).isEqualTo(expected);
    }

}
