package com.blogspot.ostas.leetcode.all.hard.abbreviating_the_product_of_a_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: left = 1, right = 4
    Output: "24e0"
    Explanation: The product is 1 × 2 × 3 × 4 = 24.
    There are no trailing zeros, so 24 remains the same. The abbreviation will end with "e0".
    Since the number of digits is 2, which is less than 10, we do not have to abbreviate it further.
    Thus, the final representation is "24e0".
    Example 2:
    Input: left = 2, right = 11
    Output: "399168e2"
    Explanation: The product is 39916800.
    There are 2 trailing zeros, which we remove to get 399168. The abbreviation will end with "e2".
    The number of digits after removing the trailing zeros is 6, so we do not abbreviate it further.
    Hence, the abbreviated product is "399168e2".
    Example 3:
    Input: left = 371, right = 375
    Output: "7219856259e3"
    Explanation: The product is 7219856259000.
      Constraints:
    1 <= left <= right <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int left = 1;
        int right = 4;
        String expected = "24e0";
        var result = solution.abbreviateProduct(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int left = 2;
        int right = 11;
        String expected = "399168e2";
        var result = solution.abbreviateProduct(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int left = 371;
        int right = 375;
        String expected = "7219856259e3";
        var result = solution.abbreviateProduct(left, right);
        assertThat(result).isEqualTo(expected);
    }

}
