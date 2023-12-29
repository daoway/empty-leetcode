package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_ways_to_partition_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,-1,2], k = 3
    Output: 1
    Explanation: One optimal approach is to change nums[0] to k. The array becomes [3,-1,2].
    There is one way to partition the array:
    - For pivot = 2, we have the partition [3,-1 | 2]: 3 + -1 == 2.
    Example 2:
    Input: nums = [0,0,0], k = 1
    Output: 2
    Explanation: The optimal approach is to leave the array unchanged.
    There are two ways to partition the array:
    - For pivot = 1, we have the partition [0 | 0,0]: 0 == 0 + 0.
    - For pivot = 2, we have the partition [0,0 | 0]: 0 + 0 == 0.
    Example 3:
    Input: nums = [22,4,-25,-20,-15,15,-16,7,19,-10,0,-13,-14], k = -33
    Output: 4
    Explanation: One optimal approach is to change nums[2] to k. The array becomes [22,4,-33,-20,-15,15,-16,7,19,-10,0,-13,-14].
    There are four ways to partition the array.
      Constraints:
    n == nums.length
    2 <= n <= 105
    -105 <= k, nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, -1, 2};
        int k = 3;
        int expected = 1;
        var result = solution.waysToPartition(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0};
        int k = 1;
        int expected = 2;
        var result = solution.waysToPartition(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{22, 4, -25, -20, -15, 15, -16, 7, 19, -10, 0, -13, -14};
        int k = -33;
        int expected = 4;
        var result = solution.waysToPartition(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
