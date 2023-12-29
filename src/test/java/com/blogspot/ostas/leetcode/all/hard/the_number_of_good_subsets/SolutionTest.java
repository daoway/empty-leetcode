package com.blogspot.ostas.leetcode.all.hard.the_number_of_good_subsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: 6
    Explanation: The good subsets are:
    - [1,2]: product is 2, which is the product of distinct prime 2.
    - [1,2,3]: product is 6, which is the product of distinct primes 2 and 3.
    - [1,3]: product is 3, which is the product of distinct prime 3.
    - [2]: product is 2, which is the product of distinct prime 2.
    - [2,3]: product is 6, which is the product of distinct primes 2 and 3.
    - [3]: product is 3, which is the product of distinct prime 3.
    Example 2:
    Input: nums = [4,2,3,15]
    Output: 5
    Explanation: The good subsets are:
    - [2]: product is 2, which is the product of distinct prime 2.
    - [2,3]: product is 6, which is the product of distinct primes 2 and 3.
    - [2,15]: product is 30, which is the product of distinct primes 2, 3, and 5.
    - [3]: product is 3, which is the product of distinct prime 3.
    - [15]: product is 15, which is the product of distinct primes 3 and 5.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 6;
        var result = solution.numberOfGoodSubsets(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 3, 15};
        int expected = 5;
        var result = solution.numberOfGoodSubsets(nums);
        assertThat(result).isEqualTo(expected);
    }

}
