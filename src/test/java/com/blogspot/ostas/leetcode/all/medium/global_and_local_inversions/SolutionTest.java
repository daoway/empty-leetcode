package com.blogspot.ostas.leetcode.all.medium.global_and_local_inversions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,0,2]
    Output: true
    Explanation: There is 1 global inversion and 1 local inversion.
    Example 2:
    Input: nums = [1,2,0]
    Output: false
    Explanation: There are 2 global inversions and 1 local inversion.
      Constraints:
    n == nums.length
    1 <= n <= 105
    0 <= nums[i] < n
    All the integers of nums are unique.
    nums is a permutation of all the numbers in the range [0, n - 1].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 2};
        boolean expected = true;
        var result = solution.isIdealPermutation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 0};
        boolean expected = false;
        var result = solution.isIdealPermutation(nums);
        assertThat(result).isEqualTo(expected);
    }

}
