package com.blogspot.ostas.leetcode.all.easy.average_value_of_even_numbers_that_are_divisible_by_three;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,6,10,12,15]
    Output: 9
    Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
    Example 2:
    Input: nums = [1,2,4,7,10]
    Output: 0
    Explanation: There is no single number that satisfies the requirement, so return 0.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 6, 10, 12, 15};
        int expected = 9;
        var result = solution.averageValue(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4, 7, 10};
        int expected = 0;
        var result = solution.averageValue(nums);
        assertThat(result).isEqualTo(expected);
    }

}
