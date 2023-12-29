package com.blogspot.ostas.leetcode.all.medium.find_indices_with_index_and_value_difference_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,1,4,1], indexDifference = 2, valueDifference = 4
    Output: [0,3]
    Explanation: In this example, i = 0 and j = 3 can be selected.
    abs(0 - 3) >= 2 and abs(nums[0] - nums[3]) >= 4.
    Hence, a valid answer is [0,3].
    [3,0] is also a valid answer.
    Example 2:
    Input: nums = [2,1], indexDifference = 0, valueDifference = 0
    Output: [0,0]
    Explanation: In this example, i = 0 and j = 0 can be selected.
    abs(0 - 0) >= 0 and abs(nums[0] - nums[0]) >= 0.
    Hence, a valid answer is [0,0].
    Other valid answers are [0,1], [1,0], and [1,1].
    Example 3:
    Input: nums = [1,2,3], indexDifference = 2, valueDifference = 4
    Output: [-1,-1]
    Explanation: In this example, it can be shown that it is impossible to find two indices that satisfy both conditions.
    Hence, [-1,-1] is returned.
      Constraints:
    1 <= n == nums.length <= 105
    0 <= nums[i] <= 109
    0 <= indexDifference <= 105
    0 <= valueDifference <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 1, 4, 1};
        int indexDifference = 2;
        int valueDifference = 4;
        int[] expected = new int[]{0, 3};
        var result = solution.findIndices(nums, indexDifference, valueDifference);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1};
        int indexDifference = 0;
        int valueDifference = 0;
        int[] expected = new int[]{0, 0};
        var result = solution.findIndices(nums, indexDifference, valueDifference);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int indexDifference = 2;
        int valueDifference = 4;
        int[] expected = new int[]{-1, -1};
        var result = solution.findIndices(nums, indexDifference, valueDifference);
        assertThat(result).isEqualTo(expected);
    }

}
