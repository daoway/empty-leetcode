package com.blogspot.ostas.leetcode.all.easy.contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,1]
    Output: true
    Example 2:
    Input: nums = [1,2,3,4]
    Output: false
    Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
      Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        boolean expected = true;
        var result = solution.containsDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        boolean expected = false;
        var result = solution.containsDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expected = true;
        var result = solution.containsDuplicate(nums);
        assertThat(result).isEqualTo(expected);
    }

}
