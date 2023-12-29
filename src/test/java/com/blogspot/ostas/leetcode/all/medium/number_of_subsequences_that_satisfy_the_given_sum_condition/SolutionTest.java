package com.blogspot.ostas.leetcode.all.medium.number_of_subsequences_that_satisfy_the_given_sum_condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,5,6,7], target = 9
    Output: 4
    Explanation: There are 4 subsequences that satisfy the condition.
    [3] -> Min value + max value <= target (3 + 3 <= 9)
    [3,5] -> (3 + 5 <= 9)
    [3,5,6] -> (3 + 6 <= 9)
    [3,6] -> (3 + 6 <= 9)
    Example 2:
    Input: nums = [3,3,6,8], target = 10
    Output: 6
    Explanation: There are 6 subsequences that satisfy the condition. (nums can have repeated numbers).
    [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]
    Example 3:
    Input: nums = [2,3,3,4,6,7], target = 12
    Output: 61
    Explanation: There are 63 non-empty subsequences, two of them do not satisfy the condition ([6,7], [7]).
    Number of valid subsequences (63 - 2 = 61).
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 106
    1 <= target <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 5, 6, 7};
        int target = 9;
        int expected = 4;
        var result = solution.numSubseq(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 3, 6, 8};
        int target = 10;
        int expected = 6;
        var result = solution.numSubseq(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 3, 4, 6, 7};
        int target = 12;
        int expected = 61;
        var result = solution.numSubseq(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
