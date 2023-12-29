package com.blogspot.ostas.leetcode.all.medium.count_number_of_bad_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,1,3,3]
    Output: 5
    Explanation: The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
    The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
    The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
    The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
    The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
    There are a total of 5 bad pairs, so we return 5.
    Example 2:
    Input: nums = [1,2,3,4,5]
    Output: 0
    Explanation: There are no bad pairs.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 1, 3, 3};
        long expected = 5;
        var result = solution.countBadPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        long expected = 0;
        var result = solution.countBadPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
