package com.blogspot.ostas.leetcode.all.medium.sum_of_even_numbers_after_queries;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
    Output: [8,6,2,4]
    Explanation: At the beginning, the array is [1,2,3,4].
    After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
    After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
    After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
    After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
    Example 2:
    Input: nums = [1], queries = [[4,0]]
    Output: [0]
      Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    1 <= queries.length <= 104
    -104 <= vali <= 104
    0 <= indexi < nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] expected = new int[]{8, 6, 2, 4};
        var result = solution.sumEvenAfterQueries(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int[][] queries = new int[][]{{4, 0}};
        int[] expected = new int[]{0};
        var result = solution.sumEvenAfterQueries(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

}
