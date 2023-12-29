package com.blogspot.ostas.leetcode.all.medium.minimum_absolute_difference_queries;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,4,8], queries = [[0,1],[1,2],[2,3],[0,3]]
    Output: [2,1,4,1]
    Explanation: The queries are processed as follows:
    - queries[0] = [0,1]: The subarray is [1,3] and the minimum absolute difference is |1-3| = 2.
    - queries[1] = [1,2]: The subarray is [3,4] and the minimum absolute difference is |3-4| = 1.
    - queries[2] = [2,3]: The subarray is [4,8] and the minimum absolute difference is |4-8| = 4.
    - queries[3] = [0,3]: The subarray is [1,3,4,8] and the minimum absolute difference is |3-4| = 1.
    Example 2:
    Input: nums = [4,5,2,2,7,10], queries = [[2,3],[0,2],[0,5],[3,5]]
    Output: [-1,1,1,3]
    Explanation: The queries are processed as follows:
    - queries[0] = [2,3]: The subarray is [2,2] and the minimum absolute difference is -1 because all the
      elements are the same.
    - queries[1] = [0,2]: The subarray is [4,5,2] and the minimum absolute difference is |4-5| = 1.
    - queries[2] = [0,5]: The subarray is [4,5,2,2,7,10] and the minimum absolute difference is |4-5| = 1.
    - queries[3] = [3,5]: The subarray is [2,7,10] and the minimum absolute difference is |7-10| = 3.
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i] <= 100
    1 <= queries.length <= 2 * 104
    0 <= li < ri < nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 8};
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 3}};
        int[] expected = new int[]{2, 1, 4, 1};
        var result = solution.minDifference(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 2, 2, 7, 10};
        int[][] queries = new int[][]{{2, 3}, {0, 2}, {0, 5}, {3, 5}};
        int[] expected = new int[]{-1, 1, 1, 3};
        var result = solution.minDifference(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

}
