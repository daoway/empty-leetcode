package com.blogspot.ostas.leetcode.all.medium.majority_element_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,3]
    Output: [3]
    Example 2:
    Input: nums = [1]
    Output: [1]
    Example 3:
    Input: nums = [1,2]
    Output: [1,2]
      Constraints:
    1 <= nums.length <= 5 * 104
    -109 <= nums[i] <= 109
      Follow up: Could you solve the problem in linear time and in O(1) space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 3};
        List<Integer> expected = List.of(3);
        var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        List<Integer> expected = List.of(1);
        var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        List<Integer> expected = List.of(1, 2);
        var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(expected);
    }

}
