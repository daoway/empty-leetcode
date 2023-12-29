package com.blogspot.ostas.leetcode.all.easy.find_the_middle_index_in_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,-1,8,4]
    Output: 3
    Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
    The sum of the numbers after index 3 is: 4 = 4
    Example 2:
    Input: nums = [1,-1,4]
    Output: 2
    Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
    The sum of the numbers after index 2 is: 0
    Example 3:
    Input: nums = [2,5]
    Output: -1
    Explanation: There is no valid middleIndex.
      Constraints:
    1 <= nums.length <= 100
    -1000 <= nums[i] <= 1000
      Note: This question is the same as 724: https://leetcode.com/problems/find-pivot-index/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, -1, 8, 4};
        int expected = 3;
        var result = solution.findMiddleIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, -1, 4};
        int expected = 2;
        var result = solution.findMiddleIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5};
        int expected = -1;
        var result = solution.findMiddleIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

}
