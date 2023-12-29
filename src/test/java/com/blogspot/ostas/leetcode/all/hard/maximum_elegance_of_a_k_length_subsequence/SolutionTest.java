package com.blogspot.ostas.leetcode.all.hard.maximum_elegance_of_a_k_length_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: items = [[3,2],[5,1],[10,1]], k = 2
    Output: 17
    Explanation: In this example, we have to select a subsequence of size 2.
    We can select items[0] = [3,2] and items[2] = [10,1].
    The total profit in this subsequence is 3 + 10 = 13, and the subsequence contains 2 distinct categories [2,1].
    Hence, the elegance is 13 + 22 = 17, and we can show that it is the maximum achievable elegance.
    Example 2:
    Input: items = [[3,1],[3,1],[2,2],[5,3]], k = 3
    Output: 19
    Explanation: In this example, we have to select a subsequence of size 3.
    We can select items[0] = [3,1], items[2] = [2,2], and items[3] = [5,3].
    The total profit in this subsequence is 3 + 2 + 5 = 10, and the subsequence contains 3 distinct categories [1,2,3].
    Hence, the elegance is 10 + 32 = 19, and we can show that it is the maximum achievable elegance.
    Example 3:
    Input: items = [[1,1],[2,1],[3,1]], k = 3
    Output: 7
    Explanation: In this example, we have to select a subsequence of size 3.
    We should select all the items.
    The total profit will be 1 + 2 + 3 = 6, and the subsequence contains 1 distinct category [1].
    Hence, the maximum elegance is 6 + 12 = 7.
      Constraints:
    1 <= items.length == n <= 105
    items[i].length == 2
    items[i][0] == profiti
    items[i][1] == categoryi
    1 <= profiti <= 109
    1 <= categoryi <= n
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] items = new int[][]{{3, 2}, {5, 1}, {10, 1}};
        int k = 2;
        long expected = 17;
        var result = solution.findMaximumElegance(items, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] items = new int[][]{{3, 1}, {3, 1}, {2, 2}, {5, 3}};
        int k = 3;
        long expected = 19;
        var result = solution.findMaximumElegance(items, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] items = new int[][]{{1, 1}, {2, 1}, {3, 1}};
        int k = 3;
        long expected = 7;
        var result = solution.findMaximumElegance(items, k);
        assertThat(result).isEqualTo(expected);
    }

}
