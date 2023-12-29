package com.blogspot.ostas.leetcode.all.medium.sum_of_absolute_differences_in_a_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,5]
    Output: [4,3,5]
    Explanation: Assuming the arrays are 0-indexed, then
    result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
    result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
    result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.
    Example 2:
    Input: nums = [1,4,6,8,10]
    Output: [24,15,13,15,21]
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i] <= nums[i + 1] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 5};
        int[] expected = new int[]{4, 3, 5};
        var result = solution.getSumAbsoluteDifferences(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 6, 8, 10};
        int[] expected = new int[]{24, 15, 13, 15, 21};
        var result = solution.getSumAbsoluteDifferences(nums);
        assertThat(result).isEqualTo(expected);
    }

}
