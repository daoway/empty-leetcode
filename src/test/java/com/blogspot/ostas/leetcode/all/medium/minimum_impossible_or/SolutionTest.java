package com.blogspot.ostas.leetcode.all.medium.minimum_impossible_or;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1]
    Output: 4
    Explanation: 1 and 2 are already present in the array. We know that 3 is expressible, since nums[0] | nums[1] = 2 | 1 = 3. Since 4 is not expressible, we return 4.
    Example 2:
    Input: nums = [5,3,2]
    Output: 1
    Explanation: We can show that 1 is the smallest number that is not expressible.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1};
        int expected = 4;
        var result = solution.minImpossibleOR(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 3, 2};
        int expected = 1;
        var result = solution.minImpossibleOR(nums);
        assertThat(result).isEqualTo(expected);
    }

}
