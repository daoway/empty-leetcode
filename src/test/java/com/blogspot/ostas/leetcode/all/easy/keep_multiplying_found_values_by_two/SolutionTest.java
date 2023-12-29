package com.blogspot.ostas.leetcode.all.easy.keep_multiplying_found_values_by_two;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,3,6,1,12], original = 3
    Output: 24
    Explanation:
    - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
    - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
    - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
    - 24 is not found in nums. Thus, 24 is returned.
    Example 2:
    Input: nums = [2,7,9], original = 4
    Output: 4
    Explanation:
    - 4 is not found in nums. Thus, 4 is returned.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i], original <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 3, 6, 1, 12};
        int original = 3;
        int expected = 24;
        var result = solution.findFinalValue(nums, original);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 7, 9};
        int original = 4;
        int expected = 4;
        var result = solution.findFinalValue(nums, original);
        assertThat(result).isEqualTo(expected);
    }

}
