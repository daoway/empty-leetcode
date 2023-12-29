package com.blogspot.ostas.leetcode.all.hard.count_array_pairs_divisible_by_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5], k = 2
    Output: 7
    Explanation:
    The 7 pairs of indices whose corresponding products are divisible by 2 are
    (0, 1), (0, 3), (1, 2), (1, 3), (1, 4), (2, 3), and (3, 4).
    Their products are 2, 4, 6, 8, 10, 12, and 20 respectively.
    Other pairs such as (0, 2) and (2, 4) have products 3 and 15 respectively, which are not divisible by 2.
    Example 2:
    Input: nums = [1,2,3,4], k = 5
    Output: 0
    Explanation: There does not exist any pair of indices whose corresponding product is divisible by 5.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i], k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        long expected = 7;
        var result = solution.countPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;
        long expected = 0;
        var result = solution.countPairs(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
