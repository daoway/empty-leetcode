package com.blogspot.ostas.leetcode.all.hard.minimum_replacements_to_sort_the_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,9,3]
    Output: 2
    Explanation: Here are the steps to sort the array in non-decreasing order:
    - From [3,9,3], replace the 9 with 3 and 6 so the array becomes [3,3,6,3]
    - From [3,3,6,3], replace the 6 with 3 and 3 so the array becomes [3,3,3,3,3]
    There are 2 steps to sort the array in non-decreasing order. Therefore, we return 2.
    Example 2:
    Input: nums = [1,2,3,4,5]
    Output: 0
    Explanation: The array is already in non-decreasing order. Therefore, we return 0.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 9, 3};
        long expected = 2;
        var result = solution.minimumReplacement(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        long expected = 0;
        var result = solution.minimumReplacement(nums);
        assertThat(result).isEqualTo(expected);
    }

}
