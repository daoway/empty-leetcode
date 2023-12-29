package com.blogspot.ostas.leetcode.all.easy.merge_similar_items;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
    Output: [[1,6],[3,9],[4,5]]
    Explanation:
    The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 5, total weight = 1 + 5 = 6.
    The item with value = 3 occurs in items1 with weight = 8 and in items2 with weight = 1, total weight = 8 + 1 = 9.
    The item with value = 4 occurs in items1 with weight = 5, total weight = 5.
    Therefore, we return [[1,6],[3,9],[4,5]].
    Example 2:
    Input: items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]
    Output: [[1,4],[2,4],[3,4]]
    Explanation:
    The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 3, total weight = 1 + 3 = 4.
    The item with value = 2 occurs in items1 with weight = 3 and in items2 with weight = 1, total weight = 3 + 1 = 4.
    The item with value = 3 occurs in items1 with weight = 2 and in items2 with weight = 2, total weight = 2 + 2 = 4.
    Therefore, we return [[1,4],[2,4],[3,4]].
    Example 3:
    Input: items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]
    Output: [[1,7],[2,4],[7,1]]
    Explanation:
    The item with value = 1 occurs in items1 with weight = 3 and in items2 with weight = 4, total weight = 3 + 4 = 7.
    The item with value = 2 occurs in items1 with weight = 2 and in items2 with weight = 2, total weight = 2 + 2 = 4.
    The item with value = 7 occurs in items2 with weight = 1, total weight = 1.
    Therefore, we return [[1,7],[2,4],[7,1]].
      Constraints:
    1 <= items1.length, items2.length <= 1000
    items1[i].length == items2[i].length == 2
    1 <= valuei, weighti <= 1000
    Each valuei in items1 is unique.
    Each valuei in items2 is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] items1 = new int[][]{{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = new int[][]{{3, 1}, {1, 5}};
        List<List<Integer>> expected = List.of(List.of(1, 6), List.of(3, 9), List.of(4, 5));
        var result = solution.mergeSimilarItems(items1, items2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] items1 = new int[][]{{1, 1}, {3, 2}, {2, 3}};
        int[][] items2 = new int[][]{{2, 1}, {3, 2}, {1, 3}};
        List<List<Integer>> expected = List.of(List.of(1, 4), List.of(2, 4), List.of(3, 4));
        var result = solution.mergeSimilarItems(items1, items2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] items1 = new int[][]{{1, 3}, {2, 2}};
        int[][] items2 = new int[][]{{7, 1}, {2, 2}, {1, 4}};
        List<List<Integer>> expected = List.of(List.of(1, 7), List.of(2, 4), List.of(7, 1));
        var result = solution.mergeSimilarItems(items1, items2);
        assertThat(result).isEqualTo(expected);
    }

}
