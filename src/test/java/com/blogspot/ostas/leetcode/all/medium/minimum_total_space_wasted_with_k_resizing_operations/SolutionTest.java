package com.blogspot.ostas.leetcode.all.medium.minimum_total_space_wasted_with_k_resizing_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,20], k = 0
    Output: 10
    Explanation: size = [20,20].
    We can set the initial size to be 20.
    The total wasted space is (20 - 10) + (20 - 20) = 10.
    Example 2:
    Input: nums = [10,20,30], k = 1
    Output: 10
    Explanation: size = [20,20,30].
    We can set the initial size to be 20 and resize to 30 at time 2.
    The total wasted space is (20 - 10) + (20 - 20) + (30 - 30) = 10.
    Example 3:
    Input: nums = [10,20,15,30,20], k = 2
    Output: 15
    Explanation: size = [10,20,20,30,30].
    We can set the initial size to 10, resize to 20 at time 1, and resize to 30 at time 3.
    The total wasted space is (10 - 10) + (20 - 20) + (20 - 15) + (30 - 30) + (30 - 20) = 15.
      Constraints:
    1 <= nums.length <= 200
    1 <= nums[i] <= 106
    0 <= k <= nums.length - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 20};
        int k = 0;
        int expected = 10;
        var result = solution.minSpaceWastedKResizing(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{10, 20, 30};
        int k = 1;
        int expected = 10;
        var result = solution.minSpaceWastedKResizing(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{10, 20, 15, 30, 20};
        int k = 2;
        int expected = 15;
        var result = solution.minSpaceWastedKResizing(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
