package com.blogspot.ostas.leetcode.all.medium.count_zero_request_servers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, logs = [[1,3],[2,6],[1,5]], x = 5, queries = [10,11]
    Output: [1,2]
    Explanation:
    For queries[0]: The servers with ids 1 and 2 get requests in the duration of [5, 10]. Hence, only server 3 gets zero requests.
    For queries[1]: Only the server with id 2 gets a request in duration of [6,11]. Hence, the servers with ids 1 and 3 are the only servers that do not receive any requests during that time period.
    Example 2:
    Input: n = 3, logs = [[2,4],[2,1],[1,2],[3,1]], x = 2, queries = [3,4]
    Output: [0,1]
    Explanation:
    For queries[0]: All servers get at least one request in the duration of [1, 3].
    For queries[1]: Only server with id 3 gets no request in the duration [2,4].
      Constraints:
    1 <= n <= 105
    1 <= logs.length <= 105
    1 <= queries.length <= 105
    logs[i].length == 2
    1 <= logs[i][0] <= n
    1 <= logs[i][1] <= 106
    1 <= x <= 105
    x < queries[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] logs = new int[][]{{1, 3}, {2, 6}, {1, 5}};
        int x = 5;
        int[] queries = new int[]{10, 11};
        int[] expected = new int[]{1, 2};
        var result = solution.countServers(n, logs, x, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] logs = new int[][]{{2, 4}, {2, 1}, {1, 2}, {3, 1}};
        int x = 2;
        int[] queries = new int[]{3, 4};
        int[] expected = new int[]{0, 1};
        var result = solution.countServers(n, logs, x, queries);
        assertThat(result).isEqualTo(expected);
    }

}
