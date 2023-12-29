package com.blogspot.ostas.leetcode.all.hard.number_of_great_partitions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4], k = 4
    Output: 6
    Explanation: The great partitions are: ([1,2,3], [4]), ([1,3], [2,4]), ([1,4], [2,3]), ([2,3], [1,4]), ([2,4], [1,3]) and ([4], [1,2,3]).
    Example 2:
    Input: nums = [3,3,3], k = 4
    Output: 0
    Explanation: There are no great partitions for this array.
    Example 3:
    Input: nums = [6,6], k = 2
    Output: 2
    Explanation: We can either put nums[0] in the first partition or in the second partition.
    The great partitions will be ([6], [6]) and ([6], [6]).
      Constraints:
    1 <= nums.length, k <= 1000
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 4;
        int expected = 6;
        var result = solution.countPartitions(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 3, 3};
        int k = 4;
        int expected = 0;
        var result = solution.countPartitions(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{6, 6};
        int k = 2;
        int expected = 2;
        var result = solution.countPartitions(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
