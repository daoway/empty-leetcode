package com.blogspot.ostas.leetcode.all.easy.subarrays_distinct_element_sum_of_squares_i;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1]
    Output: 15
    Explanation: Six possible subarrays are:
    [1]: 1 distinct value
    [2]: 1 distinct value
    [1]: 1 distinct value
    [1,2]: 2 distinct values
    [2,1]: 2 distinct values
    [1,2,1]: 2 distinct values
    The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.
    Example 2:
    Input: nums = [1,1]
    Output: 3
    Explanation: Three possible subarrays are:
    [1]: 1 distinct value
    [1]: 1 distinct value
    [1,1]: 1 distinct value
    The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 = 3.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 2, 1);
        int expected = 15;
        var result = solution.sumCounts(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 1);
        int expected = 3;
        var result = solution.sumCounts(nums);
        assertThat(result).isEqualTo(expected);
    }

}
