package com.blogspot.ostas.leetcode.all.hard.recover_the_original_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,10,6,4,8,12]
    Output: [3,7,11]
    Explanation:
    If arr = [3,7,11] and k = 1, we get lower = [2,6,10] and higher = [4,8,12].
    Combining lower and higher gives us [2,6,10,4,8,12], which is a permutation of nums.
    Another valid possibility is that arr = [5,7,9] and k = 3. In that case, lower = [2,4,6] and higher = [8,10,12].
    Example 2:
    Input: nums = [1,1,3,3]
    Output: [2,2]
    Explanation:
    If arr = [2,2] and k = 1, we get lower = [1,1] and higher = [3,3].
    Combining lower and higher gives us [1,1,3,3], which is equal to nums.
    Note that arr cannot be [1,3] because in that case, the only possible way to obtain [1,1,3,3] is with k = 0.
    This is invalid since k must be positive.
    Example 3:
    Input: nums = [5,435]
    Output: [220]
    Explanation:
    The only possible combination is arr = [220] and k = 215. Using them, we get lower = [5] and higher = [435].
      Constraints:
    2 * n == nums.length
    1 <= n <= 1000
    1 <= nums[i] <= 109
    The test cases are generated such that there exists at least one valid array arr.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 10, 6, 4, 8, 12};
        int[] expected = new int[]{3, 7, 11};
        var result = solution.recoverArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 3, 3};
        int[] expected = new int[]{2, 2};
        var result = solution.recoverArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{5, 435};
        int[] expected = new int[]{220};
        var result = solution.recoverArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
