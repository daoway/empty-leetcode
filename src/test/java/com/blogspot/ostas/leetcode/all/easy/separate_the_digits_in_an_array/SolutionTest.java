package com.blogspot.ostas.leetcode.all.easy.separate_the_digits_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [13,25,83,77]
    Output: [1,3,2,5,8,3,7,7]
    Explanation:
    - The separation of 13 is [1,3].
    - The separation of 25 is [2,5].
    - The separation of 83 is [8,3].
    - The separation of 77 is [7,7].
    answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.
    Example 2:
    Input: nums = [7,1,3,9]
    Output: [7,1,3,9]
    Explanation: The separation of each integer in nums is itself.
    answer = [7,1,3,9].
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{13, 25, 83, 77};
        int[] expected = new int[]{1, 3, 2, 5, 8, 3, 7, 7};
        var result = solution.separateDigits(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{7, 1, 3, 9};
        int[] expected = new int[]{7, 1, 3, 9};
        var result = solution.separateDigits(nums);
        assertThat(result).isEqualTo(expected);
    }

}
