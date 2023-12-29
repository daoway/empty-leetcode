package com.blogspot.ostas.leetcode.all.medium.most_profitable_path_in_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[0,1],[1,2],[1,3],[3,4]], bob = 3, amount = [-2,4,2,-4,6]
    Output: 6
    Explanation:
    The above diagram represents the given tree. The game goes as follows:
    - Alice is initially on node 0, Bob on node 3. They open the gates of their respective nodes.
      Alice's net income is now -2.
    - Both Alice and Bob move to node 1.
      Since they reach here simultaneously, they open the gate together and share the reward.
      Alice's net income becomes -2 + (4 / 2) = 0.
    - Alice moves on to node 3. Since Bob already opened its gate, Alice's income remains unchanged.
      Bob moves on to node 0, and stops moving.
    - Alice moves on to node 4 and opens the gate there. Her net income becomes 0 + 6 = 6.
    Now, neither Alice nor Bob can make any further moves, and the game ends.
    It is not possible for Alice to get a higher net income.
    Example 2:
    Input: edges = [[0,1]], bob = 1, amount = [-7280,2350]
    Output: -7280
    Explanation:
    Alice follows the path 0->1 whereas Bob follows the path 1->0.
    Thus, Alice opens the gate at node 0 only. Hence, her net income is -7280.
      Constraints:
    2 <= n <= 105
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    edges represents a valid tree.
    1 <= bob < n
    amount.length == n
    amount[i] is an even integer in the range [-104, 104].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}};
        int bob = 3;
        int[] amount = new int[]{-2, 4, 2, -4, 6};
        int expected = 6;
        var result = solution.mostProfitablePath(edges, bob, amount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}};
        int bob = 1;
        int[] amount = new int[]{-7280, 2350};
        int expected = -7280;
        var result = solution.mostProfitablePath(edges, bob, amount);
        assertThat(result).isEqualTo(expected);
    }

}
