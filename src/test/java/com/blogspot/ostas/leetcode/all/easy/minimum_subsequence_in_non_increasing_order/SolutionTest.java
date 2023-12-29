package com.blogspot.ostas.leetcode.all.easy.minimum_subsequence_in_non_increasing_order;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,10,9,8]
    Output: [10,9]
    Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum of their elements is strictly greater than the sum of elements not included. However, the subsequence [10,9] has the maximum total sum of its elements.
    Example 2:
    Input: nums = [4,4,7,6,7]
    Output: [7,7,6]
    Explanation: The subsequence [7,7] has the sum of its elements equal to 14 which is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6). Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions. Note the subsequence has to be returned in non-decreasing order.
      Constraints:
    1 <= nums.length <= 500
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 10, 9, 8};
        List<Integer> expected = List.of(10, 9);
        var result = solution.minSubsequence(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 4, 7, 6, 7};
        List<Integer> expected = List.of(7, 7, 6);
        var result = solution.minSubsequence(nums);
        assertThat(result).isEqualTo(expected);
    }

}
