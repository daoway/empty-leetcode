package com.blogspot.ostas.leetcode.all.medium.make_costs_of_paths_equal_in_a_binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7, cost = [1,5,2,2,3,3,1]
    Output: 6
    Explanation: We can do the following increments:
    - Increase the cost of node 4 one time.
    - Increase the cost of node 3 three times.
    - Increase the cost of node 7 two times.
    Each path from the root to a leaf will have a total cost of 9.
    The total increments we did is 1 + 3 + 2 = 6.
    It can be shown that this is the minimum answer we can achieve.
    Example 2:
    Input: n = 3, cost = [5,3,3]
    Output: 0
    Explanation: The two paths already have equal total costs, so no increments are needed.
      Constraints:
    3 <= n <= 105
    n + 1 is a power of 2
    cost.length == n
    1 <= cost[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int[] cost = new int[]{1, 5, 2, 2, 3, 3, 1};
        int expected = 6;
        var result = solution.minIncrements(n, cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[] cost = new int[]{5, 3, 3};
        int expected = 0;
        var result = solution.minIncrements(n, cost);
        assertThat(result).isEqualTo(expected);
    }

}
