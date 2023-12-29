package com.blogspot.ostas.leetcode.all.hard.count_the_number_of_good_partitions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: 8
    Explanation: The 8 possible good partitions are: ([1], [2], [3], [4]), ([1], [2], [3,4]), ([1], [2,3], [4]), ([1], [2,3,4]), ([1,2], [3], [4]), ([1,2], [3,4]), ([1,2,3], [4]), and ([1,2,3,4]).
    Example 2:
    Input: nums = [1,1,1,1]
    Output: 1
    Explanation: The only possible good partition is: ([1,1,1,1]).
    Example 3:
    Input: nums = [1,2,1,3]
    Output: 2
    Explanation: The 2 possible good partitions are: ([1,2,1], [3]) and ([1,2,1,3]).
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 8;
        var result = solution.numberOfGoodPartitions(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1};
        int expected = 1;
        var result = solution.numberOfGoodPartitions(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 3};
        int expected = 2;
        var result = solution.numberOfGoodPartitions(nums);
        assertThat(result).isEqualTo(expected);
    }

}
