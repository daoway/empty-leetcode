package com.blogspot.ostas.leetcode.all.hard.contains_duplicate_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
    Output: true
    Explanation: We can choose (i, j) = (0, 3).
    We satisfy the three conditions:
    i != j --> 0 != 3
    abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
    abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
    Example 2:
    Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
    Output: false
    Explanation: After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.
      Constraints:
    2 <= nums.length <= 105
    -109 <= nums[i] <= 109
    1 <= indexDiff <= nums.length
    0 <= valueDiff <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        int indexDiff = 3;
        int valueDiff = 0;
        boolean expected = true;
        var result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 9, 1, 5, 9};
        int indexDiff = 2;
        int valueDiff = 3;
        boolean expected = false;
        var result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertThat(result).isEqualTo(expected);
    }

}
