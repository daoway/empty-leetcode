package com.blogspot.ostas.leetcode.all.hard.find_building_where_alice_and_bob_can_meet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: heights = [6,4,8,5,2,7], queries = [[0,1],[0,3],[2,4],[3,4],[2,2]]
    Output: [2,5,-1,5,2]
    Explanation: In the first query, Alice and Bob can move to building 2 since heights[0] < heights[2] and heights[1] < heights[2].
    In the second query, Alice and Bob can move to building 5 since heights[0] < heights[5] and heights[3] < heights[5].
    In the third query, Alice cannot meet Bob since Alice cannot move to any other building.
    In the fourth query, Alice and Bob can move to building 5 since heights[3] < heights[5] and heights[4] < heights[5].
    In the fifth query, Alice and Bob are already in the same building.
    For ans[i] != -1, It can be shown that ans[i] is the leftmost building where Alice and Bob can meet.
    For ans[i] == -1, It can be shown that there is no building where Alice and Bob can meet.
    Example 2:
    Input: heights = [5,3,8,2,6,1,4,6], queries = [[0,7],[3,5],[5,2],[3,0],[1,6]]
    Output: [7,6,-1,4,6]
    Explanation: In the first query, Alice can directly move to Bob's building since heights[0] < heights[7].
    In the second query, Alice and Bob can move to building 6 since heights[3] < heights[6] and heights[5] < heights[6].
    In the third query, Alice cannot meet Bob since Bob cannot move to any other building.
    In the fourth query, Alice and Bob can move to building 4 since heights[3] < heights[4] and heights[0] < heights[4].
    In the fifth query, Alice can directly move to Bob's building since heights[1] < heights[6].
    For ans[i] != -1, It can be shown that ans[i] is the leftmost building where Alice and Bob can meet.
    For ans[i] == -1, It can be shown that there is no building where Alice and Bob can meet.
      Constraints:
    1 <= heights.length <= 5 * 104
    1 <= heights[i] <= 109
    1 <= queries.length <= 5 * 104
    queries[i] = [ai, bi]
    0 <= ai, bi <= heights.length - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] heights = new int[]{6, 4, 8, 5, 2, 7};
        int[][] queries = new int[][]{{0, 1}, {0, 3}, {2, 4}, {3, 4}, {2, 2}};
        int[] expected = new int[]{2, 5, -1, 5, 2};
        var result = solution.leftmostBuildingQueries(heights, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] heights = new int[]{5, 3, 8, 2, 6, 1, 4, 6};
        int[][] queries = new int[][]{{0, 7}, {3, 5}, {5, 2}, {3, 0}, {1, 6}};
        int[] expected = new int[]{7, 6, -1, 4, 6};
        var result = solution.leftmostBuildingQueries(heights, queries);
        assertThat(result).isEqualTo(expected);
    }

}
