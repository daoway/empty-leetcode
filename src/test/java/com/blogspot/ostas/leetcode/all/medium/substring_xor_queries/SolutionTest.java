package com.blogspot.ostas.leetcode.all.medium.substring_xor_queries;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "101101", queries = [[0,5],[1,2]]
    Output: [[0,2],[2,3]]
    Explanation: For the first query the substring in range [0,2] is "101" which has a decimal value of 5, and 5 ^ 0 = 5, hence the answer to the first query is [0,2]. In the second query, the substring in range [2,3] is "11", and has a decimal value of 3, and 3 ^ 1 = 2. So, [2,3] is returned for the second query.
    Example 2:
    Input: s = "0101", queries = [[12,8]]
    Output: [[-1,-1]]
    Explanation: In this example there is no substring that answers the query, hence [-1,-1] is returned.
    Example 3:
    Input: s = "1", queries = [[4,5]]
    Output: [[0,0]]
    Explanation: For this example, the substring in range [0,0] has a decimal value of 1, and 1 ^ 4 = 5. So, the answer is [0,0].
      Constraints:
    1 <= s.length <= 104
    s[i] is either '0' or '1'.
    1 <= queries.length <= 105
    0 <= firsti, secondi <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "101101";
        int[][] queries = new int[][]{{0, 5}, {1, 2}};
        int[][] expected = new int[][]{{0, 2}, {2, 3}};
        var result = solution.substringXorQueries(s, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0101";
        int[][] queries = new int[][]{{12, 8}};
        int[][] expected = new int[][]{{-1, -1}};
        var result = solution.substringXorQueries(s, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1";
        int[][] queries = new int[][]{{4, 5}};
        int[][] expected = new int[][]{{0, 0}};
        var result = solution.substringXorQueries(s, queries);
        assertThat(result).isEqualTo(expected);
    }

}
