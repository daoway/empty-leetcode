package com.blogspot.ostas.leetcode.all.easy.contains_duplicate_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,1], k = 3
    Output: true
    Example 2:
    Input: nums = [1,0,1,1], k = 1
    Output: true
    Example 3:
    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false
      Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    0 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        boolean expected = true;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;
        boolean expected = true;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean expected = false;
        var result = solution.containsNearbyDuplicate(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
