package com.blogspot.ostas.leetcode.all.hard.count_of_smaller_numbers_after_self;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,2,6,1]
    Output: [2,1,1,0]
    Explanation:
    To the right of 5 there are 2 smaller elements (2 and 1).
    To the right of 2 there is only 1 smaller element (1).
    To the right of 6 there is 1 smaller element (1).
    To the right of 1 there is 0 smaller element.
    Example 2:
    Input: nums = [-1]
    Output: [0]
    Example 3:
    Input: nums = [-1,-1]
    Output: [0,0]
      Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 6, 1};
        List<Integer> expected = List.of(2, 1, 1, 0);
        var result = solution.countSmaller(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1};
        List<Integer> expected = List.of(0);
        var result = solution.countSmaller(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -1};
        List<Integer> expected = List.of(0, 0);
        var result = solution.countSmaller(nums);
        assertThat(result).isEqualTo(expected);
    }

}
