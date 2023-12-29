package com.blogspot.ostas.leetcode.all.medium.maximum_strength_of_a_group;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,-1,-5,2,5,-9]
    Output: 1350
    Explanation: One way to form a group of maximal strength is to group the students at indices [0,2,3,4,5]. Their strength is 3 * (-5) * 2 * 5 * (-9) = 1350, which we can show is optimal.
    Example 2:
    Input: nums = [-4,-5,-4]
    Output: 20
    Explanation: Group the students at indices [0, 1] . Then, we’ll have a resulting strength of 20. We cannot achieve greater strength.
      Constraints:
    1 <= nums.length <= 13
    -9 <= nums[i] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, -1, -5, 2, 5, -9};
        long expected = 1350;
        var result = solution.maxStrength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-4, -5, -4};
        long expected = 20;
        var result = solution.maxStrength(nums);
        assertThat(result).isEqualTo(expected);
    }

}
