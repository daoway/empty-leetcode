package com.blogspot.ostas.leetcode.all.medium.count_the_number_of_complete_components;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, edges = [[0,1],[0,2],[1,2],[3,4]]
    Output: 3
    Explanation: From the picture above, one can see that all of the components of this graph are complete.
    Example 2:
    Input: n = 6, edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]
    Output: 1
    Explanation: The component containing vertices 0, 1, and 2 is complete since there is an edge between every pair of two vertices. On the other hand, the component containing vertices 3, 4, and 5 is not complete since there is no edge between vertices 4 and 5. Thus, the number of complete components in this graph is 1.
      Constraints:
    1 <= n <= 50
    0 <= edges.length <= n * (n - 1) / 2
    edges[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    There are no repeated edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}, {3, 4}};
        int expected = 3;
        var result = solution.countCompleteComponents(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}, {3, 4}, {3, 5}};
        int expected = 1;
        var result = solution.countCompleteComponents(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
