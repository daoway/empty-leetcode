package com.blogspot.ostas.leetcode.all.medium.count_number_of_nice_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,2,1,1], k = 3
    Output: 2
    Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
    Example 2:
    Input: nums = [2,4,6], k = 1
    Output: 0
    Explanation: There is no odd numbers in the array.
    Example 3:
    Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
    Output: 16
      Constraints:
    1 <= nums.length <= 50000
    1 <= nums[i] <= 10^5
    1 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 1, 1};
        int k = 3;
        int expected = 2;
        var result = solution.numberOfSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 6};
        int k = 1;
        int expected = 0;
        var result = solution.numberOfSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
        int expected = 16;
        var result = solution.numberOfSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
