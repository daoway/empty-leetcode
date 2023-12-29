package com.blogspot.ostas.leetcode.all.hard.find_k_th_smallest_pair_distance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,1], k = 1
    Output: 0
    Explanation: Here are all the pairs:
    (1,3) -> 2
    (1,1) -> 0
    (3,1) -> 2
    Then the 1st smallest distance pair is (1,1), and its distance is 0.
    Example 2:
    Input: nums = [1,1,1], k = 2
    Output: 0
    Example 3:
    Input: nums = [1,6,1], k = 3
    Output: 5
      Constraints:
    n == nums.length
    2 <= n <= 104
    0 <= nums[i] <= 106
    1 <= k <= n * (n - 1) / 2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 1};
        int k = 1;
        int expected = 0;
        var result = solution.smallestDistancePair(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int expected = 0;
        var result = solution.smallestDistancePair(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 6, 1};
        int k = 3;
        int expected = 5;
        var result = solution.smallestDistancePair(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
