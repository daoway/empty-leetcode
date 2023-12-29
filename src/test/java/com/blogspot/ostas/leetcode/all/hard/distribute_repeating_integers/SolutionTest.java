package com.blogspot.ostas.leetcode.all.hard.distribute_repeating_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4], quantity = [2]
    Output: false
    Explanation: The 0th customer cannot be given two different integers.
    Example 2:
    Input: nums = [1,2,3,3], quantity = [2]
    Output: true
    Explanation: The 0th customer is given [3,3]. The integers [1,2] are not used.
    Example 3:
    Input: nums = [1,1,2,2], quantity = [2,2]
    Output: true
    Explanation: The 0th customer is given [1,1], and the 1st customer is given [2,2].
      Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= 1000
    m == quantity.length
    1 <= m <= 10
    1 <= quantity[i] <= 105
    There are at most 50 unique values in nums.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] quantity = new int[]{2};
        boolean expected = false;
        var result = solution.canDistribute(nums, quantity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3};
        int[] quantity = new int[]{2};
        boolean expected = true;
        var result = solution.canDistribute(nums, quantity);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 2};
        int[] quantity = new int[]{2, 2};
        boolean expected = true;
        var result = solution.canDistribute(nums, quantity);
        assertThat(result).isEqualTo(expected);
    }

}
