package com.blogspot.ostas.leetcode.all.hard.create_components_with_same_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [6,2,2,2,6], edges = [[0,1],[1,2],[1,3],[3,4]]
    Output: 2
    Explanation: The above figure shows how we can delete the edges [0,1] and [3,4]. The created components are nodes [0], [1,2,3] and [4]. The sum of the values in each component equals 6. It can be proven that no better deletion exists, so the answer is 2.
    Example 2:
    Input: nums = [2], edges = []
    Output: 0
    Explanation: There are no edges to be deleted.
      Constraints:
    1 <= n <= 2 * 104
    nums.length == n
    1 <= nums[i] <= 50
    edges.length == n - 1
    edges[i].length == 2
    0 <= edges[i][0], edges[i][1] <= n - 1
    edges represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{6, 2, 2, 2, 6};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}};
        int expected = 2;
        var result = solution.componentValue(nums, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2};
        int[][] edges = new int[][]{};
        int expected = 0;
        var result = solution.componentValue(nums, edges);
        assertThat(result).isEqualTo(expected);
    }

}
