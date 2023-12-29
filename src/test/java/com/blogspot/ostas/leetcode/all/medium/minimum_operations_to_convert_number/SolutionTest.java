package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_convert_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,12], start = 2, goal = 12
    Output: 2
    Explanation: We can go from 2 → 14 → 12 with the following 2 operations.
    - 2 + 12 = 14
    - 14 - 2 = 12
    Example 2:
    Input: nums = [3,5,7], start = 0, goal = -4
    Output: 2
    Explanation: We can go from 0 → 3 → -4 with the following 2 operations.
    - 0 + 3 = 3
    - 3 - 7 = -4
    Note that the last operation sets x out of the range 0 <= x <= 1000, which is valid.
    Example 3:
    Input: nums = [2,8,16], start = 0, goal = 1
    Output: -1
    Explanation: There is no way to convert 0 into 1.
      Constraints:
    1 <= nums.length <= 1000
    -109 <= nums[i], goal <= 109
    0 <= start <= 1000
    start != goal
    All the integers in nums are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 12};
        int start = 2;
        int goal = 12;
        int expected = 2;
        var result = solution.minimumOperations(nums, start, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 5, 7};
        int start = 0;
        int goal = -4;
        int expected = 2;
        var result = solution.minimumOperations(nums, start, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 8, 16};
        int start = 0;
        int goal = 1;
        int expected = -1;
        var result = solution.minimumOperations(nums, start, goal);
        assertThat(result).isEqualTo(expected);
    }

}
