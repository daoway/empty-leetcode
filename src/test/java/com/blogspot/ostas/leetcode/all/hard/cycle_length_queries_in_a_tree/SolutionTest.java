package com.blogspot.ostas.leetcode.all.hard.cycle_length_queries_in_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, queries = [[5,3],[4,7],[2,3]]
    Output: [4,5,3]
    Explanation: The diagrams above show the tree of 23 - 1 nodes. Nodes colored in red describe the nodes in the cycle after adding the edge.
    - After adding the edge between nodes 3 and 5, the graph contains a cycle of nodes [5,2,1,3]. Thus answer to the first query is 4. We delete the added edge and process the next query.
    - After adding the edge between nodes 4 and 7, the graph contains a cycle of nodes [4,2,1,3,7]. Thus answer to the second query is 5. We delete the added edge and process the next query.
    - After adding the edge between nodes 2 and 3, the graph contains a cycle of nodes [2,1,3]. Thus answer to the third query is 3. We delete the added edge.
    Example 2:
    Input: n = 2, queries = [[1,2]]
    Output: [2]
    Explanation: The diagram above shows the tree of 22 - 1 nodes. Nodes colored in red describe the nodes in the cycle after adding the edge.
    - After adding the edge between nodes 1 and 2, the graph contains a cycle of nodes [2,1]. Thus answer for the first query is 2. We delete the added edge.
      Constraints:
    2 <= n <= 30
    m == queries.length
    1 <= m <= 105
    queries[i].length == 2
    1 <= ai, bi <= 2n - 1
    ai != bi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] queries = new int[][]{{5, 3}, {4, 7}, {2, 3}};
        int[] expected = new int[]{4, 5, 3};
        var result = solution.cycleLengthQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] queries = new int[][]{{1, 2}};
        int[] expected = new int[]{2};
        var result = solution.cycleLengthQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

}
