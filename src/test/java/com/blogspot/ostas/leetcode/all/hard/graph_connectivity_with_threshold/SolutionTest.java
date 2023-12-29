package com.blogspot.ostas.leetcode.all.hard.graph_connectivity_with_threshold;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, threshold = 2, queries = [[1,4],[2,5],[3,6]]
    Output: [false,false,true]
    Explanation: The divisors for each number:
    1:   1
    2:   1, 2
    3:   1, 3
    4:   1, 2, 4
    5:   1, 5
    6:   1, 2, 3, 6
    Using the underlined divisors above the threshold, only cities 3 and 6 share a common divisor, so they are the
    only ones directly connected. The result of each query:
    [1,4]   1 is not connected to 4
    [2,5]   2 is not connected to 5
    [3,6]   3 is connected to 6 through path 3--6
    Example 2:
    Input: n = 6, threshold = 0, queries = [[4,5],[3,4],[3,2],[2,6],[1,3]]
    Output: [true,true,true,true,true]
    Explanation: The divisors for each number are the same as the previous example. However, since the threshold is 0,
    all divisors can be used. Since all numbers share 1 as a divisor, all cities are connected.
    Example 3:
    Input: n = 5, threshold = 1, queries = [[4,5],[4,5],[3,2],[2,3],[3,4]]
    Output: [false,false,false,false,false]
    Explanation: Only cities 2 and 4 share a common divisor 2 which is strictly greater than the threshold 1, so they are the only ones directly connected.
    Please notice that there can be multiple queries for the same pair of nodes [x, y], and that the query [x, y] is equivalent to the query [y, x].
      Constraints:
    2 <= n <= 104
    0 <= threshold <= n
    1 <= queries.length <= 105
    queries[i].length == 2
    1 <= ai, bi <= cities
    ai != bi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int threshold = 2;
        int[][] queries = new int[][]{{1, 4}, {2, 5}, {3, 6}};
        List<Boolean> expected = List.of(false, false, true);
        var result = solution.areConnected(n, threshold, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int threshold = 0;
        int[][] queries = new int[][]{{4, 5}, {3, 4}, {3, 2}, {2, 6}, {1, 3}};
        List<Boolean> expected = List.of(true, true, true, true, true);
        var result = solution.areConnected(n, threshold, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int threshold = 1;
        int[][] queries = new int[][]{{4, 5}, {4, 5}, {3, 2}, {2, 3}, {3, 4}};
        List<Boolean> expected = List.of(false, false, false, false, false);
        var result = solution.areConnected(n, threshold, queries);
        assertThat(result).isEqualTo(expected);
    }

}
