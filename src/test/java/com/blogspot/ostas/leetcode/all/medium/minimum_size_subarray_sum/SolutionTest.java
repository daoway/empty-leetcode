package com.blogspot.ostas.leetcode.all.medium.minimum_size_subarray_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 7, nums = [2,3,1,2,4,3]
    Output: 2
    Explanation: The subarray [4,3] has the minimal length under the problem constraint.
    Example 2:
    Input: target = 4, nums = [1,4,4]
    Output: 1
    Example 3:
    Input: target = 11, nums = [1,1,1,1,1,1,1,1]
    Output: 0
      Constraints:
    1 <= target <= 109
    1 <= nums.length <= 105
    1 <= nums[i] <= 104
      Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int expected = 2;
        var result = solution.minSubArrayLen(target, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 4;
        int[] nums = new int[]{1, 4, 4};
        int expected = 1;
        var result = solution.minSubArrayLen(target, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int target = 11;
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        var result = solution.minSubArrayLen(target, nums);
        assertThat(result).isEqualTo(expected);
    }

}
