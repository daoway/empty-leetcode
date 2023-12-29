package com.blogspot.ostas.leetcode.all.easy.number_of_good_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    Example 2:
    Input: nums = [1,1,1,1]
    Output: 6
    Explanation: Each pair in the array are good.
    Example 3:
    Input: nums = [1,2,3]
    Output: 0
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        int expected = 4;
        var result = solution.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1};
        int expected = 6;
        var result = solution.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = 0;
        var result = solution.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
