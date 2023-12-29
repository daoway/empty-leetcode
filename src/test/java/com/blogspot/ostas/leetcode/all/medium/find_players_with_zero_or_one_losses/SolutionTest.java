package com.blogspot.ostas.leetcode.all.medium.find_players_with_zero_or_one_losses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
    Output: [[1,2,10],[4,5,7,8]]
    Explanation:
    Players 1, 2, and 10 have not lost any matches.
    Players 4, 5, 7, and 8 each have lost one match.
    Players 3, 6, and 9 each have lost two matches.
    Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
    Example 2:
    Input: matches = [[2,3],[1,3],[5,4],[6,4]]
    Output: [[1,2,5,6],[]]
    Explanation:
    Players 1, 2, 5, and 6 have not lost any matches.
    Players 3 and 4 each have lost two matches.
    Thus, answer[0] = [1,2,5,6] and answer[1] = [].
      Constraints:
    1 <= matches.length <= 105
    matches[i].length == 2
    1 <= winneri, loseri <= 105
    winneri != loseri
    All matches[i] are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matches = new int[][]{{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9},
                {10, 4}, {10, 9}};
        List<List<Integer>> expected = List.of(List.of(1, 2, 10), List.of(4, 5, 7, 8));
        var result = solution.findWinners(matches);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matches = new int[][]{{2, 3}, {1, 3}, {5, 4}, {6, 4}};
        List<List<Integer>> expected = List.of(List.of(1, 2, 5, 6), List.of());
        var result = solution.findWinners(matches);
        assertThat(result).isEqualTo(expected);
    }

}
