package com.blogspot.ostas.leetcode.all.hard.handling_sum_queries_after_update;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums1 = [1,0,1], nums2 = [0,0,0], queries = [[1,1,1],[2,1,0],[3,0,0]]
    Output: [3]
    Explanation: After the first query nums1 becomes [1,1,1]. After the second query, nums2 becomes [1,1,1], so the answer to the third query is 3. Thus, [3] is returned.
    Example 2:
    Input: nums1 = [1], nums2 = [5], queries = [[2,0,0],[3,0,0]]
    Output: [5]
    Explanation: After the first query, nums2 remains [5], so the answer to the second query is 5. Thus, [5] is returned.
      Constraints:
    1 <= nums1.length,nums2.length <= 105
    nums1.length = nums2.length
    1 <= queries.length <= 105
    queries[i].length = 3
    0 <= l <= r <= nums1.length - 1
    0 <= p <= 106
    0 <= nums1[i] <= 1
    0 <= nums2[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums1 = new int[]{1, 0, 1};
        int[] nums2 = new int[]{0, 0, 0};
        int[][] queries = new int[][]{{1, 1, 1}, {2, 1, 0}, {3, 0, 0}};
        long[] expected = new long[]{3};
        var result = solution.handleQuery(nums1, nums2, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{5};
        int[][] queries = new int[][]{{2, 0, 0}, {3, 0, 0}};
        long[] expected = new long[]{5};
        var result = solution.handleQuery(nums1, nums2, queries);
        assertThat(result).isEqualTo(expected);
    }

}
