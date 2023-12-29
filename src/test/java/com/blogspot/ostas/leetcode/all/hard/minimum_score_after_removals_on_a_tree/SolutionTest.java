package com.blogspot.ostas.leetcode.all.hard.minimum_score_after_removals_on_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,5,5,4,11], edges = [[0,1],[1,2],[1,3],[3,4]]
    Output: 9
    Explanation: The diagram above shows a way to make a pair of removals.
    - The 1st component has nodes [1,3,4] with values [5,4,11]. Its XOR value is 5 ^ 4 ^ 11 = 10.
    - The 2nd component has node [0] with value [1]. Its XOR value is 1 = 1.
    - The 3rd component has node [2] with value [5]. Its XOR value is 5 = 5.
    The score is the difference between the largest and smallest XOR value which is 10 - 1 = 9.
    It can be shown that no other pair of removals will obtain a smaller score than 9.
    Example 2:
    Input: nums = [5,5,2,4,4,2], edges = [[0,1],[1,2],[5,2],[4,3],[1,3]]
    Output: 0
    Explanation: The diagram above shows a way to make a pair of removals.
    - The 1st component has nodes [3,4] with values [4,4]. Its XOR value is 4 ^ 4 = 0.
    - The 2nd component has nodes [1,0] with values [5,5]. Its XOR value is 5 ^ 5 = 0.
    - The 3rd component has nodes [2,5] with values [2,2]. Its XOR value is 2 ^ 2 = 0.
    The score is the difference between the largest and smallest XOR value which is 0 - 0 = 0.
    We cannot obtain a smaller score than 0.
      Constraints:
    n == nums.length
    3 <= n <= 1000
    1 <= nums[i] <= 108
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    edges represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 5, 4, 11};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}};
        int expected = 9;
        var result = solution.minimumScore(nums, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 5, 2, 4, 4, 2};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {5, 2}, {4, 3}, {1, 3}};
        int expected = 0;
        var result = solution.minimumScore(nums, edges);
        assertThat(result).isEqualTo(expected);
    }

}
