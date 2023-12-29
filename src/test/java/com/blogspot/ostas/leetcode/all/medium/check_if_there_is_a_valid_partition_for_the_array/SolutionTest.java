package com.blogspot.ostas.leetcode.all.medium.check_if_there_is_a_valid_partition_for_the_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,4,4,5,6]
    Output: true
    Explanation: The array can be partitioned into the subarrays [4,4] and [4,5,6].
    This partition is valid, so we return true.
    Example 2:
    Input: nums = [1,1,1,2]
    Output: false
    Explanation: There is no valid partition for this array.
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 4, 4, 5, 6};
        boolean expected = true;
        var result = solution.validPartition(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2};
        boolean expected = false;
        var result = solution.validPartition(nums);
        assertThat(result).isEqualTo(expected);
    }

}
