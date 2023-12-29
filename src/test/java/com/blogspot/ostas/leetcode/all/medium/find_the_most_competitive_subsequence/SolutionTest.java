package com.blogspot.ostas.leetcode.all.medium.find_the_most_competitive_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,5,2,6], k = 2
    Output: [2,6]
    Explanation: Among the set of every possible subsequence: {[3,5], [3,2], [3,6], [5,2], [5,6], [2,6]}, [2,6] is the most competitive.
    Example 2:
    Input: nums = [2,4,3,3,5,4,9,6], k = 4
    Output: [2,3,3,4]
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    1 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 5, 2, 6};
        int k = 2;
        int[] expected = new int[]{2, 6};
        var result = solution.mostCompetitive(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 3, 3, 5, 4, 9, 6};
        int k = 4;
        int[] expected = new int[]{2, 3, 3, 4};
        var result = solution.mostCompetitive(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
