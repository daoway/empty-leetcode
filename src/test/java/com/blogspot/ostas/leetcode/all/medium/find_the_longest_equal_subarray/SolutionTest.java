package com.blogspot.ostas.leetcode.all.medium.find_the_longest_equal_subarray;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,2,3,1,3], k = 3
    Output: 3
    Explanation: It's optimal to delete the elements at index 2 and index 4.
    After deleting them, nums becomes equal to [1, 3, 3, 3].
    The longest equal subarray starts at i = 1 and ends at j = 3 with length equal to 3.
    It can be proven that no longer equal subarrays can be created.
    Example 2:
    Input: nums = [1,1,2,2,1,1], k = 2
    Output: 4
    Explanation: It's optimal to delete the elements at index 2 and index 3.
    After deleting them, nums becomes equal to [1, 1, 1, 1].
    The array itself is an equal subarray, so the answer is 4.
    It can be proven that no longer equal subarrays can be created.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= nums.length
    0 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 3, 2, 3, 1, 3);
        int k = 3;
        int expected = 3;
        var result = solution.longestEqualSubarray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(1, 1, 2, 2, 1, 1);
        int k = 2;
        int expected = 4;
        var result = solution.longestEqualSubarray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
