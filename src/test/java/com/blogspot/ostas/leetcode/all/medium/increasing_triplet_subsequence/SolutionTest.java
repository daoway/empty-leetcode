package com.blogspot.ostas.leetcode.all.medium.increasing_triplet_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5]
    Output: true
    Explanation: Any triplet where i < j < k is valid.
    Example 2:
    Input: nums = [5,4,3,2,1]
    Output: false
    Explanation: No triplet exists.
    Example 3:
    Input: nums = [2,1,5,0,4,6]
    Output: true
    Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
      Constraints:
    1 <= nums.length <= 5 * 105
    -231 <= nums[i] <= 231 - 1
      Follow up: Could you implement a solution that runs in O(n) time complexity and O(1) space complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        boolean expected = true;
        var result = solution.increasingTriplet(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 4, 3, 2, 1};
        boolean expected = false;
        var result = solution.increasingTriplet(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 5, 0, 4, 6};
        boolean expected = true;
        var result = solution.increasingTriplet(nums);
        assertThat(result).isEqualTo(expected);
    }

}
