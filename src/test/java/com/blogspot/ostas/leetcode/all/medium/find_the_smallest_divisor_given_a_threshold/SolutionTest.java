package com.blogspot.ostas.leetcode.all.medium.find_the_smallest_divisor_given_a_threshold;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,5,9], threshold = 6
    Output: 5
    Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
    If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
    Example 2:
    Input: nums = [44,22,33,11,1], threshold = 5
    Output: 44
      Constraints:
    1 <= nums.length <= 5 * 104
    1 <= nums[i] <= 106
    nums.length <= threshold <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 5, 9};
        int threshold = 6;
        int expected = 5;
        var result = solution.smallestDivisor(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{44, 22, 33, 11, 1};
        int threshold = 5;
        int expected = 44;
        var result = solution.smallestDivisor(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

}
