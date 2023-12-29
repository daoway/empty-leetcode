package com.blogspot.ostas.leetcode.all.easy.semi_ordered_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,4,3]
    Output: 2
    Explanation: We can make the permutation semi-ordered using these sequence of operations:
    1 - swap i = 0 and j = 1. The permutation becomes [1,2,4,3].
    2 - swap i = 2 and j = 3. The permutation becomes [1,2,3,4].
    It can be proved that there is no sequence of less than two operations that make nums a semi-ordered permutation.
    Example 2:
    Input: nums = [2,4,1,3]
    Output: 3
    Explanation: We can make the permutation semi-ordered using these sequence of operations:
    1 - swap i = 1 and j = 2. The permutation becomes [2,1,4,3].
    2 - swap i = 0 and j = 1. The permutation becomes [1,2,4,3].
    3 - swap i = 2 and j = 3. The permutation becomes [1,2,3,4].
    It can be proved that there is no sequence of less than three operations that make nums a semi-ordered permutation.
    Example 3:
    Input: nums = [1,3,4,2,5]
    Output: 0
    Explanation: The permutation is already a semi-ordered permutation.
      Constraints:
    2 <= nums.length == n <= 50
    1 <= nums[i] <= 50
    nums is a permutation.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 4, 3};
        int expected = 2;
        var result = solution.semiOrderedPermutation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 1, 3};
        int expected = 3;
        var result = solution.semiOrderedPermutation(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 2, 5};
        int expected = 0;
        var result = solution.semiOrderedPermutation(nums);
        assertThat(result).isEqualTo(expected);
    }

}
