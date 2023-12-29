package com.blogspot.ostas.leetcode.all.medium.sort_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,2,3,1]
    Output: [1,2,3,5]
    Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
    Example 2:
    Input: nums = [5,1,1,2,0,0]
    Output: [0,0,1,1,2,5]
    Explanation: Note that the values of nums are not necessairly unique.
      Constraints:
    1 <= nums.length <= 5 * 104
    -5 * 104 <= nums[i] <= 5 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 3, 1};
        int[] expected = new int[]{1, 2, 3, 5};
        var result = solution.sortArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 1, 1, 2, 0, 0};
        int[] expected = new int[]{0, 0, 1, 1, 2, 5};
        var result = solution.sortArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
