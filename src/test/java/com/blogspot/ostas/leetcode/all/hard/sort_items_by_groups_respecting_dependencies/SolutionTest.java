package com.blogspot.ostas.leetcode.all.hard.sort_items_by_groups_respecting_dependencies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
    Output: [6,3,4,1,5,2,0,7]
    Example 2:
    Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
    Output: []
    Explanation: This is the same as example 1 except that 4 needs to be before 6 in the sorted list.
      Constraints:
    1 <= m <= n <= 3 * 104
    group.length == beforeItems.length == n
    -1 <= group[i] <= m - 1
    0 <= beforeItems[i].length <= n - 1
    0 <= beforeItems[i][j] <= n - 1
    i != beforeItems[i][j]
    beforeItems[i] does not contain duplicates elements.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 8;
        int m = 2;
        int[] group = new int[]{-1, -1, 1, 0, 0, 1, 0, -1};
        List<List<Integer>> beforeItems =
                List.of(List.of(), List.of(6), List.of(5), List.of(6), List.of(3, 6),
                        List.of(), List.of(), List.of());
        int[] expected = new int[]{6, 3, 4, 1, 5, 2, 0, 7};
        var result = solution.sortItems(n, m, group, beforeItems);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 8;
        int m = 2;
        int[] group = new int[]{-1, -1, 1, 0, 0, 1, 0, -1};
        List<List<Integer>> beforeItems =
                List.of(List.of(), List.of(6), List.of(5), List.of(6), List.of(3), List.of(),
                        List.of(4), List.of());
        int[] expected = new int[]{};
        var result = solution.sortItems(n, m, group, beforeItems);
        assertThat(result).isEqualTo(expected);
    }

}
