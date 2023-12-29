package com.blogspot.ostas.leetcode.all.medium.minimize_maximum_pair_sum_in_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,5,2,3]
    Output: 7
    Explanation: The elements can be paired up into pairs (3,3) and (5,2).
    The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.
    Example 2:
    Input: nums = [3,5,4,2,4,6]
    Output: 8
    Explanation: The elements can be paired up into pairs (3,5), (4,4), and (6,2).
    The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.
      Constraints:
    n == nums.length
    2 <= n <= 105
    n is even.
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 5, 2, 3};
        int expected = 7;
        var result = solution.minPairSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 5, 4, 2, 4, 6};
        int expected = 8;
        var result = solution.minPairSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
