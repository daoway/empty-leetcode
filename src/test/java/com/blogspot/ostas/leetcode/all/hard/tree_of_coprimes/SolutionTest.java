package com.blogspot.ostas.leetcode.all.hard.tree_of_coprimes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,3,2], edges = [[0,1],[1,2],[1,3]]
    Output: [-1,0,0,1]
    Explanation: In the above figure, each node's value is in parentheses.
    - Node 0 has no coprime ancestors.
    - Node 1 has only one ancestor, node 0. Their values are coprime (gcd(2,3) == 1).
    - Node 2 has two ancestors, nodes 1 and 0. Node 1's value is not coprime (gcd(3,3) == 3), but node 0's
      value is (gcd(2,3) == 1), so node 0 is the closest valid ancestor.
    - Node 3 has two ancestors, nodes 1 and 0. It is coprime with node 1 (gcd(3,2) == 1), so node 1 is its
      closest valid ancestor.
    Example 2:
    Input: nums = [5,6,10,2,3,6,15], edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]]
    Output: [-1,0,-1,0,0,0,-1]
      Constraints:
    nums.length == n
    1 <= nums[i] <= 50
    1 <= n <= 105
    edges.length == n - 1
    edges[j].length == 2
    0 <= uj, vj < n
    uj != vj
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 3, 2};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}};
        int[] expected = new int[]{-1, 0, 0, 1};
        var result = solution.getCoprimes(nums, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 6, 10, 2, 3, 6, 15};
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}};
        int[] expected = new int[]{-1, 0, -1, 0, 0, 0, -1};
        var result = solution.getCoprimes(nums, edges);
        assertThat(result).isEqualTo(expected);
    }

}
