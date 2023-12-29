package com.blogspot.ostas.leetcode.all.medium.xor_queries_of_a_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
    Output: [2,7,14,8]
    Explanation:
    The binary representation of the elements in the array are:
    1 = 0001
    3 = 0011
    4 = 0100
    8 = 1000
    The XOR values for queries are:
    [0,1] = 1 xor 3 = 2
    [1,2] = 3 xor 4 = 7
    [0,3] = 1 xor 3 xor 4 xor 8 = 14
    [3,3] = 8
    Example 2:
    Input: arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
    Output: [8,0,4,4]
      Constraints:
    1 <= arr.length, queries.length <= 3 * 104
    1 <= arr[i] <= 109
    queries[i].length == 2
    0 <= lefti <= righti < arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 3, 4, 8};
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] expected = new int[]{2, 7, 14, 8};
        var result = solution.xorQueries(arr, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{4, 8, 2, 10};
        int[][] queries = new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}};
        int[] expected = new int[]{8, 0, 4, 4};
        var result = solution.xorQueries(arr, queries);
        assertThat(result).isEqualTo(expected);
    }

}
