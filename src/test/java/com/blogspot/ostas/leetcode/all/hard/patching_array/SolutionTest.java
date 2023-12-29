package com.blogspot.ostas.leetcode.all.hard.patching_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3], n = 6
    Output: 1
    Explanation:
    Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
    Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
    Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
    So we only need 1 patch.
    Example 2:
    Input: nums = [1,5,10], n = 20
    Output: 2
    Explanation: The two patches can be [2, 4].
    Example 3:
    Input: nums = [1,2,2], n = 5
    Output: 0
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 104
    nums is sorted in ascending order.
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3};
        int n = 6;
        int expected = 1;
        var result = solution.minPatches(nums, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 10};
        int n = 20;
        int expected = 2;
        var result = solution.minPatches(nums, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2};
        int n = 5;
        int expected = 0;
        var result = solution.minPatches(nums, n);
        assertThat(result).isEqualTo(expected);
    }

}
