package com.blogspot.ostas.leetcode.all.easy.difference_between_element_sum_and_digit_sum_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,15,6,3]
    Output: 9
    Explanation:
    The element sum of nums is 1 + 15 + 6 + 3 = 25.
    The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
    The absolute difference between the element sum and digit sum is |25 - 16| = 9.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 0
    Explanation:
    The element sum of nums is 1 + 2 + 3 + 4 = 10.
    The digit sum of nums is 1 + 2 + 3 + 4 = 10.
    The absolute difference between the element sum and digit sum is |10 - 10| = 0.
      Constraints:
    1 <= nums.length <= 2000
    1 <= nums[i] <= 2000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 15, 6, 3};
        int expected = 9;
        var result = solution.differenceOfSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 0;
        var result = solution.differenceOfSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
