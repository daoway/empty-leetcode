package com.blogspot.ostas.leetcode.all.medium.the_number_of_beautiful_subsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,6], k = 2
    Output: 4
    Explanation: The beautiful subsets of the array nums are: [2], [4], [6], [2, 6].
    It can be proved that there are only 4 beautiful subsets in the array [2,4,6].
    Example 2:
    Input: nums = [1], k = 1
    Output: 1
    Explanation: The beautiful subset of the array nums is [1].
    It can be proved that there is only 1 beautiful subset in the array [1].
      Constraints:
    1 <= nums.length <= 20
    1 <= nums[i], k <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 6};
        int k = 2;
        int expected = 4;
        var result = solution.beautifulSubsets(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int k = 1;
        int expected = 1;
        var result = solution.beautifulSubsets(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
