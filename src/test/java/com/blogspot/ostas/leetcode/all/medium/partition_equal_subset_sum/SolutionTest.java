package com.blogspot.ostas.leetcode.all.medium.partition_equal_subset_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,5,11,5]
    Output: true
    Explanation: The array can be partitioned as [1, 5, 5] and [11].
    Example 2:
    Input: nums = [1,2,3,5]
    Output: false
    Explanation: The array cannot be partitioned into equal sum subsets.
      Constraints:
    1 <= nums.length <= 200
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 11, 5};
        boolean expected = true;
        var result = solution.canPartition(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 5};
        boolean expected = false;
        var result = solution.canPartition(nums);
        assertThat(result).isEqualTo(expected);
    }

}
