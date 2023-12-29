package com.blogspot.ostas.leetcode.all.medium.ways_to_split_array_into_three_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1]
    Output: 1
    Explanation: The only good way to split nums is [1] [1] [1].
    Example 2:
    Input: nums = [1,2,2,2,5,0]
    Output: 3
    Explanation: There are three good ways of splitting nums:
    [1] [2] [2,2,5,0]
    [1] [2,2] [2,5,0]
    [1,2] [2,2] [5,0]
    Example 3:
    Input: nums = [3,2,1]
    Output: 0
    Explanation: There is no good way to split nums.
      Constraints:
    3 <= nums.length <= 105
    0 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 1;
        var result = solution.waysToSplit(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 2, 5, 0};
        int expected = 3;
        var result = solution.waysToSplit(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1};
        int expected = 0;
        var result = solution.waysToSplit(nums);
        assertThat(result).isEqualTo(expected);
    }

}
