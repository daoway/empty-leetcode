package com.blogspot.ostas.leetcode.all.medium.ways_to_make_a_fair_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,6,4]
    Output: 1
    Explanation:
    Remove index 0: [1,6,4] -> Even sum: 1 + 4 = 5. Odd sum: 6. Not fair.
    Remove index 1: [2,6,4] -> Even sum: 2 + 4 = 6. Odd sum: 6. Fair.
    Remove index 2: [2,1,4] -> Even sum: 2 + 4 = 6. Odd sum: 1. Not fair.
    Remove index 3: [2,1,6] -> Even sum: 2 + 6 = 8. Odd sum: 1. Not fair.
    There is 1 index that you can remove to make nums fair.
    Example 2:
    Input: nums = [1,1,1]
    Output: 3
    Explanation: You can remove any index and the remaining array is fair.
    Example 3:
    Input: nums = [1,2,3]
    Output: 0
    Explanation: You cannot make a fair array after removing any index.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 6, 4};
        int expected = 1;
        var result = solution.waysToMakeFair(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 3;
        var result = solution.waysToMakeFair(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = 0;
        var result = solution.waysToMakeFair(nums);
        assertThat(result).isEqualTo(expected);
    }

}
