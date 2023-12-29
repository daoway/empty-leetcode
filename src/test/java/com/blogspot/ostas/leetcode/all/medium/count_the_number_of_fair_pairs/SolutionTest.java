package com.blogspot.ostas.leetcode.all.medium.count_the_number_of_fair_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
    Output: 6
    Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
    Example 2:
    Input: nums = [1,7,9,2,5], lower = 11, upper = 11
    Output: 1
    Explanation: There is a single fair pair: (2,3).
      Constraints:
    1 <= nums.length <= 105
    nums.length == n
    -109 <= nums[i] <= 109
    -109 <= lower <= upper <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 7, 4, 4, 5};
        int lower = 3;
        int upper = 6;
        long expected = 6;
        var result = solution.countFairPairs(nums, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 7, 9, 2, 5};
        int lower = 11;
        int upper = 11;
        long expected = 1;
        var result = solution.countFairPairs(nums, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

}
