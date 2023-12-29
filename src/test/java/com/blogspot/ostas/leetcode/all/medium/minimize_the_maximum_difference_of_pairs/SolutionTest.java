package com.blogspot.ostas.leetcode.all.medium.minimize_the_maximum_difference_of_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,1,2,7,1,3], p = 2
    Output: 1
    Explanation: The first pair is formed from the indices 1 and 4, and the second pair is formed from the indices 2 and 5.
    The maximum difference is max(|nums[1] - nums[4]|, |nums[2] - nums[5]|) = max(0, 1) = 1. Therefore, we return 1.
    Example 2:
    Input: nums = [4,2,1,2], p = 1
    Output: 0
    Explanation: Let the indices 1 and 3 form a pair. The difference of that pair is |2 - 2| = 0, which is the minimum we can attain.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    0 <= p <= (nums.length)/2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 1, 2, 7, 1, 3};
        int p = 2;
        int expected = 1;
        var result = solution.minimizeMax(nums, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 1, 2};
        int p = 1;
        int expected = 0;
        var result = solution.minimizeMax(nums, p);
        assertThat(result).isEqualTo(expected);
    }

}
