package com.blogspot.ostas.leetcode.all.medium.make_lexicographically_smallest_array_by_swapping_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,5,3,9,8], limit = 2
    Output: [1,3,5,8,9]
    Explanation: Apply the operation 2 times:
    - Swap nums[1] with nums[2]. The array becomes [1,3,5,9,8]
    - Swap nums[3] with nums[4]. The array becomes [1,3,5,8,9]
    We cannot obtain a lexicographically smaller array by applying any more operations.
    Note that it may be possible to get the same result by doing different operations.
    Example 2:
    Input: nums = [1,7,6,18,2,1], limit = 3
    Output: [1,6,7,18,1,2]
    Explanation: Apply the operation 3 times:
    - Swap nums[1] with nums[2]. The array becomes [1,6,7,18,2,1]
    - Swap nums[0] with nums[4]. The array becomes [2,6,7,18,1,1]
    - Swap nums[0] with nums[5]. The array becomes [1,6,7,18,1,2]
    We cannot obtain a lexicographically smaller array by applying any more operations.
    Example 3:
    Input: nums = [1,7,28,19,10], limit = 3
    Output: [1,7,28,19,10]
    Explanation: [1,7,28,19,10] is the lexicographically smallest array we can obtain because we cannot apply the operation on any two indices.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= limit <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 3, 9, 8};
        int limit = 2;
        int[] expected = new int[]{1, 3, 5, 8, 9};
        var result = solution.lexicographicallySmallestArray(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 7, 6, 18, 2, 1};
        int limit = 3;
        int[] expected = new int[]{1, 6, 7, 18, 1, 2};
        var result = solution.lexicographicallySmallestArray(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 7, 28, 19, 10};
        int limit = 3;
        int[] expected = new int[]{1, 7, 28, 19, 10};
        var result = solution.lexicographicallySmallestArray(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

}
