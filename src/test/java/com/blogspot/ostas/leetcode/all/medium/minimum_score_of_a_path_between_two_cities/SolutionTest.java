package com.blogspot.ostas.leetcode.all.medium.minimum_score_of_a_path_between_two_cities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
    Output: 5
    Explanation: The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 4. The score of this path is min(9,5) = 5.
    It can be shown that no other path has less score.
    Example 2:
    Input: n = 4, roads = [[1,2,2],[1,3,4],[3,4,7]]
    Output: 2
    Explanation: The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 1 -> 3 -> 4. The score of this path is min(2,2,4,7) = 2.
      Constraints:
    2 <= n <= 105
    1 <= roads.length <= 105
    roads[i].length == 3
    1 <= ai, bi <= n
    ai != bi
    1 <= distancei <= 104
    There are no repeated edges.
    There is at least one path between 1 and n.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] roads = new int[][]{{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}};
        int expected = 5;
        var result = solution.minScore(n, roads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[][] roads = new int[][]{{1, 2, 2}, {1, 3, 4}, {3, 4, 7}};
        int expected = 2;
        var result = solution.minScore(n, roads);
        assertThat(result).isEqualTo(expected);
    }

}
