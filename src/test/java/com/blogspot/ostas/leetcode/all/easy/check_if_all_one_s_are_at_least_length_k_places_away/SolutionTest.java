package com.blogspot.ostas.leetcode.all.easy.check_if_all_one_s_are_at_least_length_k_places_away;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,0,0,0,1,0,0,1], k = 2
    Output: true
    Explanation: Each of the 1s are at least 2 places away from each other.
    Example 2:
    Input: nums = [1,0,0,1,0,1], k = 2
    Output: false
    Explanation: The second 1 and third 1 are only one apart from each other.
      Constraints:
    1 <= nums.length <= 105
    0 <= k <= nums.length
    nums[i] is 0 or 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
        boolean expected = true;
        var result = solution.kLengthApart(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 0, 1, 0, 1};
        int k = 2;
        boolean expected = false;
        var result = solution.kLengthApart(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
