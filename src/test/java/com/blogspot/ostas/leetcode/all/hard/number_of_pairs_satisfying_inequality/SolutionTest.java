package com.blogspot.ostas.leetcode.all.hard.number_of_pairs_satisfying_inequality;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [3,2,5], nums2 = [2,2,1], diff = 1
    Output: 3
    Explanation:
    There are 3 pairs that satisfy the conditions:
    1. i = 0, j = 1: 3 - 2 <= 2 - 2 + 1. Since i < j and 1 <= 1, this pair satisfies the conditions.
    2. i = 0, j = 2: 3 - 5 <= 2 - 1 + 1. Since i < j and -2 <= 2, this pair satisfies the conditions.
    3. i = 1, j = 2: 2 - 5 <= 2 - 1 + 1. Since i < j and -3 <= 2, this pair satisfies the conditions.
    Therefore, we return 3.
    Example 2:
    Input: nums1 = [3,-1], nums2 = [-2,2], diff = -1
    Output: 0
    Explanation:
    Since there does not exist any pair that satisfies the conditions, we return 0.
      Constraints:
    n == nums1.length == nums2.length
    2 <= n <= 105
    -104 <= nums1[i], nums2[i] <= 104
    -104 <= diff <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, 2, 5};
        int[] nums2 = new int[]{2, 2, 1};
        int diff = 1;
        long expected = 3;
        var result = solution.numberOfPairs(nums1, nums2, diff);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{3, -1};
        int[] nums2 = new int[]{-2, 2};
        int diff = -1;
        long expected = 0;
        var result = solution.numberOfPairs(nums1, nums2, diff);
        assertThat(result).isEqualTo(expected);
    }

}
