package com.blogspot.ostas.leetcode.all.easy.sort_array_by_parity_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,5,7]
    Output: [4,5,2,7]
    Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
    Example 2:
    Input: nums = [2,3]
    Output: [2,3]
      Constraints:
    2 <= nums.length <= 2 * 104
    nums.length is even.
    Half of the integers in nums are even.
    0 <= nums[i] <= 1000
      Follow Up: Could you solve it in-place?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 5, 7};
        int[] expected1 = new int[]{4, 5, 2, 7};
        int[] expected2 = new int[]{4, 7, 2, 5};
        int[] expected3 = new int[]{2, 5, 4, 7};
        int[] expected4 = new int[]{2, 7, 4, 5};

        var result = solution.sortArrayByParityII(nums);
        assertThat(result).isIn(expected1, expected2, expected3, expected4);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3};
        int[] expected = new int[]{2, 3};
        var result = solution.sortArrayByParityII(nums);
        assertThat(result).isEqualTo(expected);
    }

}
