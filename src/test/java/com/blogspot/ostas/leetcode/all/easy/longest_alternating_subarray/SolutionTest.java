package com.blogspot.ostas.leetcode.all.easy.longest_alternating_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,4,3,4]
    Output: 4
    Explanation: The alternating subarrays are [3,4], [3,4,3], and [3,4,3,4]. The longest of these is [3,4,3,4], which is of length 4.
    Example 2:
    Input: nums = [4,5,6]
    Output: 2
    Explanation: [4,5] and [5,6] are the only two alternating subarrays. They are both of length 2.
      Constraints:
    2 <= nums.length <= 100
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 4, 3, 4};
        int expected = 4;
        var result = solution.alternatingSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 6};
        int expected = 2;
        var result = solution.alternatingSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
