package com.blogspot.ostas.leetcode.all.hard.russian_doll_envelopes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: envelopes = [[5,4],[6,4],[6,7],[2,3]]
    Output: 3
    Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
    Example 2:
    Input: envelopes = [[1,1],[1,1],[1,1]]
    Output: 1
      Constraints:
    1 <= envelopes.length <= 105
    envelopes[i].length == 2
    1 <= wi, hi <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] envelopes = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        int expected = 3;
        var result = solution.maxEnvelopes(envelopes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] envelopes = new int[][]{{1, 1}, {1, 1}, {1, 1}};
        int expected = 1;
        var result = solution.maxEnvelopes(envelopes);
        assertThat(result).isEqualTo(expected);
    }

}
