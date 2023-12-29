package com.blogspot.ostas.leetcode.all.medium.minimum_non_zero_product_of_the_array_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: p = 1
    Output: 1
    Explanation: nums = [1].
    There is only one element, so the product equals that element.
    Example 2:
    Input: p = 2
    Output: 6
    Explanation: nums = [01, 10, 11].
    Any swap would either make the product 0 or stay the same.
    Thus, the array product of 1 * 2 * 3 = 6 is already minimized.
    Example 3:
    Input: p = 3
    Output: 1512
    Explanation: nums = [001, 010, 011, 100, 101, 110, 111]
    - In the first operation we can swap the leftmost bit of the second and fifth elements.
    - The resulting array is [001, 110, 011, 100, 001, 110, 111].
    - In the second operation we can swap the middle bit of the third and fourth elements.
    - The resulting array is [001, 110, 001, 110, 001, 110, 111].
    The array product is 1 * 6 * 1 * 6 * 1 * 6 * 7 = 1512, which is the minimum possible product.
      Constraints:
    1 <= p <= 60
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int p = 1;
        int expected = 1;
        var result = solution.minNonZeroProduct(p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int p = 2;
        int expected = 6;
        var result = solution.minNonZeroProduct(p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int p = 3;
        int expected = 1512;
        var result = solution.minNonZeroProduct(p);
        assertThat(result).isEqualTo(expected);
    }

}
