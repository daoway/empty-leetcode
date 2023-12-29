package com.blogspot.ostas.leetcode.all.medium.visit_array_positions_to_maximize_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,6,1,9,2], x = 5
    Output: 13
    Explanation: We can visit the following positions in the array: 0 -> 2 -> 3 -> 4.
    The corresponding values are 2, 6, 1 and 9. Since the integers 6 and 1 have different parities, the move 2 -> 3 will make you lose a score of x = 5.
    The total score will be: 2 + 6 + 1 + 9 - 5 = 13.
    Example 2:
    Input: nums = [2,4,6,8], x = 3
    Output: 20
    Explanation: All the integers in the array have the same parities, so we can visit all of them without losing any score.
    The total score is: 2 + 4 + 6 + 8 = 20.
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i], x <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 6, 1, 9, 2};
        int x = 5;
        long expected = 13;
        var result = solution.maxScore(nums, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 6, 8};
        int x = 3;
        long expected = 20;
        var result = solution.maxScore(nums, x);
        assertThat(result).isEqualTo(expected);
    }

}
