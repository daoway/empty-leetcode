package com.blogspot.ostas.leetcode.all.medium.distinct_prime_factors_of_product_of_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,3,7,10,6]
    Output: 4
    Explanation:
    The product of all the elements in nums is: 2 * 4 * 3 * 7 * 10 * 6 = 10080 = 25 * 32 * 5 * 7.
    There are 4 distinct prime factors so we return 4.
    Example 2:
    Input: nums = [2,4,8,16]
    Output: 1
    Explanation:
    The product of all the elements in nums is: 2 * 4 * 8 * 16 = 1024 = 210.
    There is 1 distinct prime factor so we return 1.
      Constraints:
    1 <= nums.length <= 104
    2 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 3, 7, 10, 6};
        int expected = 4;
        var result = solution.distinctPrimeFactors(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 8, 16};
        int expected = 1;
        var result = solution.distinctPrimeFactors(nums);
        assertThat(result).isEqualTo(expected);
    }

}
