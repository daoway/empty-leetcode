package com.blogspot.ostas.leetcode.all.easy.how_many_numbers_are_smaller_than_the_current_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation:
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1).
    For nums[3]=2 there exist one smaller number than it (1).
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
    Example 2:
    Input: nums = [6,5,4,8]
    Output: [2,1,0,3]
    Example 3:
    Input: nums = [7,7,7,7]
    Output: [0,0,0,0]
      Constraints:
    2 <= nums.length <= 500
    0 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] expected = new int[]{4, 0, 1, 1, 3};
        var result = solution.smallerNumbersThanCurrent(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 5, 4, 8};
        int[] expected = new int[]{2, 1, 0, 3};
        var result = solution.smallerNumbersThanCurrent(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{7, 7, 7, 7};
        int[] expected = new int[]{0, 0, 0, 0};
        var result = solution.smallerNumbersThanCurrent(nums);
        assertThat(result).isEqualTo(expected);
    }

}
