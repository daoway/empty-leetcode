package com.blogspot.ostas.leetcode.all.medium.plates_between_candles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "**|**|***|", queries = [[2,5],[5,9]]
    Output: [2,3]
    Explanation:
    - queries[0] has two plates between candles.
    - queries[1] has three plates between candles.
    Example 2:
    Input: s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16]]
    Output: [9,0,0,0,0]
    Explanation:
    - queries[0] has nine plates between candles.
    - The other queries have zero plates between candles.
      Constraints:
    3 <= s.length <= 105
    s consists of '*' and '|' characters.
    1 <= queries.length <= 105
    queries[i].length == 2
    0 <= lefti <= righti < s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "**|**|***|";
        int[][] queries = new int[][]{{2, 5}, {5, 9}};
        int[] expected = new int[]{2, 3};
        var result = solution.platesBetweenCandles(s, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "***|**|*****|**||**|*";
        int[][] queries = new int[][]{{1, 17}, {4, 5}, {14, 17}, {5, 11}, {15, 16}};
        int[] expected = new int[]{9, 0, 0, 0, 0};
        var result = solution.platesBetweenCandles(s, queries);
        assertThat(result).isEqualTo(expected);
    }

}
