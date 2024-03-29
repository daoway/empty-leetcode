package com.blogspot.ostas.leetcode.all.medium.number_of_zero_filled_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,0,0,2,0,0,4]
    Output: 6
    Explanation:
    There are 4 occurrences of [0] as a subarray.
    There are 2 occurrences of [0,0] as a subarray.
    There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
    Example 2:
    Input: nums = [0,0,0,2,0,0]
    Output: 9
    Explanation:
    There are 5 occurrences of [0] as a subarray.
    There are 3 occurrences of [0,0] as a subarray.
    There is 1 occurrence of [0,0,0] as a subarray.
    There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
    Example 3:
    Input: nums = [2,10,2019]
    Output: 0
    Explanation: There is no subarray filled with 0. Therefore, we return 0.
      Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 0, 0, 2, 0, 0, 4};
        long expected = 6;
        var result = solution.zeroFilledSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0, 2, 0, 0};
        long expected = 9;
        var result = solution.zeroFilledSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 10, 2019};
        long expected = 0;
        var result = solution.zeroFilledSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
